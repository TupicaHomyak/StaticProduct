public class Main {
    public static void main(String[] args) {

        Product product = new Product( "milk", 57);
        Product product1 = new Product("Cake", 888);
        System.out.println(Product.getAveragePrice());
        System.out.println(Product.getCount());
        System.out.println(Product.totalPrice);
        System.out.println();


        ArithmeticCalculator calculator = new ArithmeticCalculator(56, 12);
        System.out.println("Сложение: " + calculator.calculate(Operation.ADD));
        System.out.println("Вычитание: " + calculator.calculate(Operation.SUBTRACT));
        System.out.println("Умножение: " + calculator.calculate(Operation.MULTIPLY));
        System.out.println();

        Engine engine = new Engine(
                EngineType.DIESEL, 3.5, 156
        );
        Car car = new Car(engine, CarType.SUV, 2300);
        System.out.println("Тип автомобиля: " + car.getType());
        System.out.println("Масса двигателя: " + car.getWeight());
        System.out.println("Тип двигателя: " +
                car.getEngine().getType());
        System.out.println("Объём двигателя: " +
                car.getEngine().getVolume());
        System.out.println("Мощность двигателя: " +
                car.getEngine().getPower());

    }
}