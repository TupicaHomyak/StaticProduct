public class Main {
    public static void main(String[] args) {

        Product product = new Product( "milk", 57);
        Product product1 = new Product("Cake", 888);
        System.out.println(Product.getAveragePrice());
        System.out.println(Product.getCount());
        System.out.println(Product.totalPrice);


    }
}