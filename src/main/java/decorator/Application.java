package decorator;

import decorator.decorator.ColorDecorator;

public class Application {
    public static void main(String[] args) {
        Car car = new Car();
        car.setTitle("Car");

        ColorDecorator colorDecorator = new ColorDecorator("Green");
        colorDecorator.decorate(car);

        System.out.println(car);
    }
}
