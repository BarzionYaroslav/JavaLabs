public class Market
{
    public static class Products {
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
    }
    int recnum;
    int cashnum;
    Products[] products;

    public Market(int recnum, int cashnum, Products[] products)
    {
        this.recnum = recnum;
        this.cashnum = cashnum;
        this.products = products;
    }

    public Market()
    {
        this.recnum = 20;
        this.cashnum = 20;
        this.products = new Products[2];
        for (int i = 0; i < products.length; i++)
            products[i] = new Products();
    }

    public String getProducts() {
        String temp = "";
        for (int i = 0; i < products.length; i++)
            temp += products[i].name + ": " + products[i].price + "$, " + products[i].weight + "KG. \n";
        return temp;
    }
    public void setProducts(Products[] val) {products = val;}
    public int getRecnum() {
        return recnum;
    }
    public int getCashnum() {
        return cashnum;
    }
    public void setRecnum(int val) {
        recnum = val;
    }
    public void setCashnum(int val) {
        cashnum = val;
    }
    public double getGWeight(){
        double temp = 0;
        for (int i = 0; i < products.length; i++)
        {
            temp += products[i].weight;
        }
        temp = temp / products.length;
        return temp;
    }
    public double getCashEfficiency(){
        return (double) cashnum/recnum;
    }
    public double getEfficiency(){
        return getCashEfficiency()/getGWeight();
    }
}
