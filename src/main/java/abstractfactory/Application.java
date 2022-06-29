package abstractfactory;

public class Application {
    public static void main(String[] args) {
        MercedesFactory mercedesFactory = new MercedesFactory();
        Car mercedes = mercedesFactory.create();

        VolvoFactory volvoFactory = new VolvoFactory();
        Car volvo = volvoFactory.create();

        System.out.println(mercedes);
        System.out.println(volvo);
    }
}
