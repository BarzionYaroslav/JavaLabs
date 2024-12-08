public class Products {
    String name;
    int price;
    double weight;

    public Products(String name, int price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    public Products() {
        this.name = "Apple";
        this.price = 5;
        this.weight = 1;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
