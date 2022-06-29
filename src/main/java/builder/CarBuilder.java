package builder;

public class CarBuilder {
    private String brand;
    private Integer engine;
    private Boolean autoGear;
    private Boolean abs;
    private Boolean esp;

    public static CarBuilder startBuild() {
        return new CarBuilder();
    }

    public static CarBuilder startAutoGearBuild() {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.setAutoGear(true);
        return carBuilder;
    }

    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setEngine(Integer engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setAutoGear(Boolean autoGear) {
        this.autoGear = autoGear;
        return this;
    }

    public CarBuilder setAbs(Boolean abs) {
        this.abs = abs;
        return this;
    }

    public CarBuilder setEsp(Boolean esp) {
        this.esp = esp;
        return this;
    }

    public Car build() {
        Car car = new Car();
        car.setBrand(this.brand);
        car.setEngine(this.engine);
        car.setAutoGear(this.autoGear);
        car.setEsp(this.esp);
        car.setAbs(this.abs);
        return car;
    }
}
