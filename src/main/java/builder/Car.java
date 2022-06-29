package builder;

public class Car {
    private String brand;
    private Integer engine;
    private Boolean autoGear;
    private Boolean abs;
    private Boolean esp;

    public Car() {
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getEngine() {
        return engine;
    }

    public void setEngine(Integer engine) {
        this.engine = engine;
    }

    public Boolean getAutoGear() {
        return autoGear;
    }

    public void setAutoGear(Boolean autoGear) {
        this.autoGear = autoGear;
    }

    public Boolean getAbs() {
        return abs;
    }

    public void setAbs(Boolean abs) {
        this.abs = abs;
    }

    public Boolean getEsp() {
        return esp;
    }

    public void setEsp(Boolean esp) {
        this.esp = esp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                ", autoGear=" + autoGear +
                ", abs=" + abs +
                ", esp=" + esp +
                '}';
    }
}
