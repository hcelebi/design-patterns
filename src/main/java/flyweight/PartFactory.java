package flyweight;

import java.util.HashMap;
import java.util.Map;

public class PartFactory {

    private Map<String, Part> parts = new HashMap<>();

    public PartFactory() {
        System.out.println("Part Factory Created");
    }

    public Part getPart(String part){
        return parts.get(part);
    }

    public void generateParts() {
        if (parts.get("Tire") == null) {
            parts.put("Tire", new Tire());
        }
        if (parts.get("Screw") == null) {
            parts.put("Screw", new Screw());
        }
    }
}
