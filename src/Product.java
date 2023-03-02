public class Product {
    private  final String  name;
    private  final int price;
    static  int count = 0;
    static int totalPrice = 0;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        count++;
        totalPrice = totalPrice + price;
    }
    public String getName() {return name;}
    public int getPrice() {return price;}

    public static int getCount() {
        return count;
    }
    public static double getAveragePrice() {
        return (double) totalPrice / count;
    }

}
