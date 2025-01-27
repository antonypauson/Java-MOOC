import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!registry.containsKey(licensePlate)) {
            registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (!registry.containsKey(licensePlate)) {
            return null;
        }
        return registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!registry.containsKey(licensePlate)) {
            return false;
        }
        registry.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate plates : registry.keySet()) {
            System.out.println(plates);
        }
    }

    public void printOwners() {
        for (String owner : registry.values()) {
            System.out.println(owner);
        }
    }
}
