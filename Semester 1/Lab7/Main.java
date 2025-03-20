import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Apples","Bananas","Pineapples","Watermelons","Kiwis","Pears","Bad Apple"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }
        System.out.println(names.length + ": To be honest, I hate them all");
        int fav = inputNumber("What's your favorite out of these? Input a number!");
        while ((fav<0)||(fav>names.length)) {
            System.out.println("Please enter a number on the list.");
            fav = inputNumber("What's your favorite out of these? Input a number!");
        }
        List<Products> basket = new ArrayList<>();
        int bnum = inputNumber("How much stuff do we get?");
        while (bnum<=0) {
            System.out.println("You need to get something at least");
            bnum = inputNumber("How much stuff do we get?");
        }
        Random random = new Random();
        while (bnum>0) {
            Products temp = new Products(names[random.nextInt(names.length)],
                    random.nextInt(15000),
                    random.nextDouble(10));
            //Here I might've misunderstood some things and put "check if there is no such product" not as a name
            //I could've probably chosen the name checks, but then bnum was always same as the number of names
            //I didn't like it
            //So here's this instead. I mean, I still do checks! Even more than it would be with names!
                if (!basket.contains(temp)) {
                    basket.add(temp);
                    bnum--;
                }
        }
        basket.removeIf(n -> n.getWeight()>5 || n.getPrice()>10000);
        List<Products> tempbasket = new ArrayList<>();
        if (fav!=names.length)
        {
            for (int i = 0; i < basket.size(); i++)
            {
                if (basket.get(i).getName().equals(names[fav])) {
                    tempbasket.add(basket.get(i));
                }
            }
            basket.removeAll(tempbasket);
            basket.addAll(0,tempbasket);
        }
        //Would basket.forEach() work here??? I dunno if it accepts the if checks...
        //So for loop it is then!
        for (int i = 0; i < basket.size(); i++) {
            //If there would be "and" instead of "or", there won't be products to show most of the time
            //I tested it. Not all survive the original purge, not all survive this one
            //Price has too big of a range. At best it would kinda maybe work if it was 100
            //... I am not sure though. I tested it with 1000 products and even then it can show none with "and" here
            if (basket.get(i).getWeight()>2||basket.get(i).getPrice()<10) {
                System.out.println((i + 1) + ": " +
                        basket.get(i).getName() + ", price: "
                        + basket.get(i).getPrice() + ", weight: "
                        + basket.get(i).getWeight());
            }
        }
    }
    //Haha, reusing code go brrrr
    public static int inputNumber(String why)
    {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(why);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
            System.out.println("Nuh uh! Redo!");
            sc.nextLine();
        }
    }
}
