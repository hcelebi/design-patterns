package singleton;

public class Car {

    private static Car car;

    private Car(String word) {
        System.out.println("Singleton pattern created for:" + word);
    }

    public static Car getCar(String word) {
        System.out.println("Singleton pattern requested for:" + word);

        if (car == null) {
            synchronized (Car.class) {
                if (car == null) {
                    car =  new Car(word);
                }
            }
        }

        return car;
    }
}
