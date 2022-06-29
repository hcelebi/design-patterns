package factory;

public class Mercedes implements Car {
    private String brand = "Mercedes";
    private Integer engine = 2000;

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
        return "Mercedes{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                '}';
    }
}
