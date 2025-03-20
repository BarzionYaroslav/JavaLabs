import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while(flag) {
            int taskus = inputNumber("Input a number of a task (0 to end):");
            switch (taskus) {
                case 0:
                    System.out.println("Program terminated.");
                    flag=false;
                    break;
                case 1:
                    System.out.println("You are redirected to Task " + taskus);
                    taskNum1();
                    break;
                case 2:
                    System.out.println("You are redirected to Task " + taskus);
                    taskNum2();
                    break;
                case 3:
                    System.out.println("You are redirected to Task " + taskus);
                    taskNum3();
                    break;
                case 4:
                    System.out.println("You are redirected to Task " + taskus);
                    taskNum4();
                    break;
                case 5:
                    System.out.println("You are redirected to Task " + taskus);
                    taskNum5();
                    break;
                case 6:
                    System.out.println("You are redirected to Task " + taskus);
                    taskNum6();
                    break;
                case 7:
                    System.out.println("You are redirected to Task " + taskus);
                    taskNum7();
                    break;
                case 8:
                    System.out.println("You are redirected to Task " + taskus);
                    taskNum8();
                    break;
                case 9:
                    System.out.println("You are redirected to Task " + taskus);
                    taskHeheCirnoNumber();
                    break;
                case 10:
                    System.out.println("You are redirected to Task " + taskus);
                    taskNum10();
                    break;
                case 11:
                    System.out.println("You are redirected to Task " + taskus);
                    taskNum11();
                    break;
                case 12:
                    System.out.println("You are redirected to Task " + taskus);
                    taskNum12();
                    break;
                case 13:
                    System.out.println("You are redirected to Task " + taskus);
                    taskNum13();
                    break;
                case 14:
                    System.out.println("You are redirected to Task " + taskus);
                    taskNum14();
                    break;
                case 15:
                    System.out.println("You are redirected to Task " + taskus);
                    taskNum15();
                    break;
                case 16:
                    System.out.println("You are redirected to Task " + taskus);
                    taskNum16();
                    break;
                default:
                    System.out.println("Not a valid task. Retry");
                    break;
            }
        }
    }

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

    public static float inputReal(String why)
    {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(why);
            if (sc.hasNextFloat()) {
                return sc.nextFloat();
            }
            System.out.println("Nuh uh! Redo!");
            sc.nextLine();
        }
    }

    public static void taskNum1()
    {
        float n = inputReal("Input a number:");
        System.out.println(Math.round(n));
    }

    public static void taskNum2()
    {
        float d = inputReal("Input Dollars:");
        while (d<0)
        {
            System.out.println("Thy can only use positive numbers");
            d = inputReal("Input Dollars:");
        }
        System.out.println("Фунт: " + d/1.487);
        System.out.println("Франк: " + d/0.172);
        System.out.println("Немецкая Марка: " + d/0.584);
        System.out.println("Японский Йен: " + d/0.00955);
    }

    public static void taskNum3()
    {
        float temp = inputReal("Input temperature Celsius:");
        System.out.println("Temperature in Fahrenheit: " + (temp*9/5+32));
    }
    public static void taskNum4()
    {
        float mon = inputReal("Input funds:");
        while (mon<0)
        {
            System.out.println("Thy can only use positive numbers");
            mon = inputReal("Input funds:");
        }
        float perc = inputReal("Input percentage:");
        while (perc<0)
        {
            System.out.println("Thy can only use positive numbers");
            perc = inputReal("Input percentage:");
        }
        int year = inputNumber("Input years:");
        while (year<0)
        {
            System.out.println("Thy can only use positive numbers");
            year = inputNumber("Input years:");
        }
        while (year>0)
        {
            mon+=mon*perc/100;
            year--;
        }
        System.out.println(mon);
    }
    public static void taskNum5()
    {
        for (int i=25;i<63;i++){
            if (i%2==0)
                System.out.println(i);
        }
    }
    public static void taskNum6()
    {
        int number = inputNumber("Input number:");
        if (number%2==0)
            System.out.println("YES YES YES");
        else
            System.out.println("NO NO NO");
    }
    public static void taskNum7()
    {
        int number = inputNumber("Input number of tickets:");
        int tic1 = 0;
        int tic5 = 0;
        int tic10 = 0;
        int tic20 = 0;
        int tic60 = 0;
        while (number<0)
        {
            System.out.println("Thy can only use positive numbers");
            number = inputNumber("Input number of tickets:");
        }
        while(number>=60)
        {
            tic60++;
            number-=60;
        }
        while(number>=20){
            tic20++;
            number-=20;
        }
        while(number>=10){
            tic10++;
            number-=10;
        }
        while(number>=5){
            tic5++;
            number-=5;
        }
        while(number>=1){
            tic1++;
            number-=1;
        }
        System.out.println(tic1+" "+tic5+" "+tic10+" "+tic20+" "+tic60);
    }
    public static void taskNum8()
    {
        int a=inputNumber("Input a:");
        int b=inputNumber("Input b:");
        if (a==0)
        {
            if (b==0)
            {
                System.out.println("INF");
            }
            else
            {
                System.out.println("NO");
            }
        }
        else
        {
            int x = (-b)/a;
            if (a*x+b!=0)
            {
                System.out.println("NO");
            }
            else
                System.out.println(x);
        }
    }
    public static void taskHeheCirnoNumber()
    {
        int number = inputNumber("Input number:");
        while (number<0)
        {
            System.out.println("Thy can only use positive numbers");
            number = inputNumber("Input number:");
        }
        int res =1;
        for (int i=1;i<=number;i++)
        {
            res*=i;
        }
        System.out.println(res);
    }
    public static void taskNum10()
    {
        int number = inputNumber("Input number:");
        while (number<0)
        {
            System.out.println("Thy can only use positive numbers");
            number = inputNumber("Input number:");
        }
        int dig = 1;
        int sum = 0;
        while (Math.floor(number/Math.pow(10,dig))!=0)
        {
            dig++;
        }
        for (int i=0;i<dig;i++)
        {
            sum+=Integer.parseInt(String.valueOf(number).substring(i,i+1));
        }
        System.out.println(sum);
    }
    public static void taskNum11()
    {
        int a = inputNumber("Input a:");
        int b = inputNumber("Input b:");
        for (int i=a;i<=b;i++)
        {
            if (i%2==0)
                System.out.println(i);
        }
    }
    public static void taskNum12()
    {
        int a = inputNumber("Input a:");
        int b = inputNumber("Input b:");
        System.out.println(Math.max(a,b));
    }
    public static void taskNum13()
    {
        int n = inputNumber("Input year:");
        while (n<0)
        {
            System.out.println("Thy can only use positive numbers");
            n = inputNumber("Input year:");
        }
        if ((n%4==0&&n%100!=0)||(n%400==0))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static void taskNum14()
    {
        int n = inputNumber("Input number:");
        if (n<0)
            System.out.println(-1);
        if (n>0)
            System.out.println(1);
        if (n==0)
            System.out.println(0);
    }
    public static void taskNum15()
    {
        int a = inputNumber("Input a:");
        while (a < 0) {
            System.out.println("Thy can only use positive numbers");
            a = inputNumber("Input a:");
        }
        int b = inputNumber("Input b:");
        while (b < 0) {
            System.out.println("Thy can only use positive numbers");
            b = inputNumber("Input b:");
        }
        int c = inputNumber("Input c:");
        while (c < 0) {
            System.out.println("Thy can only use positive numbers");
            c = inputNumber("Input c:");
        }
        int d = inputNumber("Input d:");
        while (d < 0) {
            System.out.println("Thy can only use positive numbers");
            d = inputNumber("Input d:");
        }
        System.out.println(Math.abs(c-a)+" "+Math.abs(d-b));
    }
    public static void taskNum16(){
        int number = inputNumber("Input number:");
        while (number<0)
        {
            System.out.println("Thy can only use positive numbers");
            number = inputNumber("Input number:");
        }
        while ((number%3!=0) && (number>3)){
            number-=5;
        }
        if ((number%3==0) && (number>=3)||(number==0))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
