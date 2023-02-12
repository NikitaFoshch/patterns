package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehiclesFactory {
    private static final Map<String, Vehicles> map = new HashMap<>();

    public Vehicles getVehiclesFactory(String machine) {
        Vehicles vehicles = map.get(machine);

        if (vehicles == null) {
            switch (machine) {
                case "moped" -> {
                    System.out.println("Making a moped.");
                    vehicles = new Moped();
                }
                case "motorcycle" -> {
                    System.out.println("Making a motorcycle.");
                    vehicles = new Motorcycle();
                }
            }
            map.put(machine, vehicles);
        }
        return vehicles;
    }
}
