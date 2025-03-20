public class Main {
    public static void main(String[] args) {
        Market.Products[] temp = new Market.Products[]
                {new Market.Products("Banana", 12, 2),
                new Market.Products("Apple", 10, 6),
                new Market.Products("Orange", 5, 4),
                new Market.Products("Pineapple", 10, 2),
                new Market.Products("Watermelon", 25, 3),};
        Market mart = new Market(25,30, temp);
        Supermarket megamart = new Supermarket(
                40,
                20,
                temp,
                50,
                new String[64]);
        System.out.println(mart.getEfficiency());
        System.out.println(megamart.getEfficiency());
    }
}
