package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<Tire> tires = new ArrayList<>();

    public List<Tire> getTires() {
        return tires;
    }

    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }

    @Override
    public String toString() {
        return "Car{" +
                "tires=" + tires +
                '}';
    }
}
