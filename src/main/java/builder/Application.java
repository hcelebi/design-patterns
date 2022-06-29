package builder;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Mercedes");
        car1.setEngine(2000);
        car1.setAutoGear(true);
        car1.setAbs(true);
        car1.setEsp(true);

        Car car2 = new Car("Volvo");
        car2.setEngine(1800);

        Car car3 = CarBuilder.startBuild()
                .setBrand("Audi")
                .setEngine(2200)
                .setAutoGear(false)
                .setAbs(true)
                .setEsp(false)
                .build();

        Car car4 = CarBuilder.startAutoGearBuild()
                .setBrand("Totoya")
                .setEngine(1200)
                .build();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}

