package abstractfactory;

public class Volvo implements Car {
    private String brand = "Volvo";
    private Integer engine = 1800;

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public Integer getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Volvo{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                '}';
    }
}
