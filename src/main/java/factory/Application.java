package factory;

public class Application {
    public static void main(String[] args) {
        Car mercedes = CarFactory.create("Mercedes");
        Car volvo = CarFactory.create("Volvo");

        System.out.println(mercedes);
        System.out.println(volvo);
    }
}
