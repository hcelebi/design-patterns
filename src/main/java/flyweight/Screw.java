package flyweight;

public class Screw implements Part {
    public Screw() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Screw created!");
    }
}
