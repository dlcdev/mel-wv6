package repository;

import models.Vehicle;

import java.util.List;

public class CarRepository implements Repository<Vehicle>{

    List<Vehicle> listVehicle;
    @Override
    public void save(Vehicle vehicle) {
     listVehicle.add(vehicle);
    }
}
