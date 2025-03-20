public class Supermarket extends Market{
    double area;
    String[] categories;
    public Supermarket() {
        super();
        this.area = 10;
        this.categories = new String[] {"Cheese", "Fruit", "Vegetables"};
    }
    public Supermarket(int recnum, int cashnum, Products[] products, int area, String[] category) {
        super();
        this.recnum = recnum;
        this.cashnum = cashnum;
        this.products = products;
        this.area = area;
        this.categories = category;
    }

    @Override
    public double getEfficiency(){
        double temp=area/categories.length;
        return getCashEfficiency()*temp;
    }
}
