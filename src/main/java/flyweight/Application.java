package flyweight;

public class Application {
    public static void main(String[] args) {
        PartFactory partFactory = new PartFactory();
        partFactory.generateParts();

        Car car = new Car();

        for (int i = 0; i < 4; i++) {
            Tire tire = (Tire) partFactory.getPart("Tire");
            tire.deleteScrews();
            for (int j = 0; j < 4; j++) {
                tire.addScrew((Screw) partFactory.getPart("Screw"));
            }
            System.out.println("Tire Attach: " + tire.isAttached());
            car.getTires().add(tire);
        }
        System.out.println(car);
    }
}
