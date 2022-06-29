package factory;

public class CarFactory {
    public static Car create(String brand){
        if (brand.equals("Mercedes")) {
            return new Mercedes();
        } else if (brand.equals("Volvo")) {
            return new Volvo();
        }
        throw new RuntimeException();
    }
}
