package singleton;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Application {
    public static void main(String[] args) {
        Instant t1 = Instant.now();
        List<String> words = Arrays.asList(
                "the",
                "quick",
                "brown",
                "fox",
                "jumped",
                "over",
                "the",
                "lazy",
                "dog"
        );
        CountDownLatch countDownLatch = new CountDownLatch(1);
        words.forEach(s -> {
            new Thread(() -> Car.getCar(s)).start();
        });
        countDownLatch.countDown();

        System.out.println(Instant.now().getNano() - t1.getNano());
    }
}

