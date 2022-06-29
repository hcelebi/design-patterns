package decorator.decorator;

import decorator.Car;

public class ColorDecorator implements CarDecorator {

    private String color;

    public ColorDecorator(String color) {
        this.color = color;
    }

    @Override
    public Car decorate(Car car) {
        car.setTitle(color + " " + car.getTitle());
        return car;
    }
}
