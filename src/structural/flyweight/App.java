package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] arg) {
        VehiclesFactory vehiclesFactory = new VehiclesFactory();

        List<Vehicles> vehicles = new ArrayList<>();

        vehicles.add(vehiclesFactory.getVehiclesFactory("motorcycle"));
        vehicles.add(vehiclesFactory.getVehiclesFactory("motorcycle"));
        vehicles.add(vehiclesFactory.getVehiclesFactory("moped"));
        vehicles.add(vehiclesFactory.getVehiclesFactory("moped"));
        vehicles.add(vehiclesFactory.getVehiclesFactory("moped"));
        vehicles.add(vehiclesFactory.getVehiclesFactory("moped"));


        for (Vehicles vehicles1 : vehicles) {
            vehicles1.movement();
        }

    }
}
