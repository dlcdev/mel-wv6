package models;

import java.util.List;

public class Garage {
    private int id;
    private static List<Vehicles> vehicles;

    public Garage(int id, List<Vehicles> vehiclesValue) {
        this.id = id;
        vehicles = vehiclesValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static List<Vehicles> getVehicles() {
        return vehicles;
    }

    public void addVehicles(List<Vehicles> vehiclesValue) {
        vehicles.add((Vehicles) vehiclesValue);
    }

    @Override
    public String toString() {
        return "Garage " + id;
    }
}
