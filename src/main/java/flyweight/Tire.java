package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Tire implements Part {
    private List<Screw> screws = new ArrayList<>();

    public Tire() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tire created!");
    }

    public Boolean isAttached() {
        if (screws.size() == 4) {
            return true;
        } else {
            return false;
        }
    }

    public void addScrew(Screw screw) {
        screws.add(screw);
    }

    public void deleteScrews(){
        screws = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Tire{" +
                "screws=" + screws +
                '}';
    }
}
