package models;

import java.util.List;
import java.awt.*;
import java.util.stream.Collectors;

public class Running {
    private double distance;
    private double prizeInDollars;
    private String name;
    private int numberOfVehiclesAllowed;
    private List<Vehicle> vehicles;

    public Running(double distance, double prizeInDollars, String name, int numberOfVehiclesAllowed, List<Vehicle> vehicles) {
        this.distance = distance;
        this.prizeInDollars = prizeInDollars;
        this.name = name;
        this.numberOfVehiclesAllowed = numberOfVehiclesAllowed;
        this.vehicles = vehicles;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getPrizeInDollars() {
        return prizeInDollars;
    }

    public void setPrizeInDollars(double prizeInDollars) {
        this.prizeInDollars = prizeInDollars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfVehiclesAllowed() {
        return numberOfVehiclesAllowed;
    }

    public void setNumberOfVehiclesAllowed(int numberOfVehiclesAllowed) {
        this.numberOfVehiclesAllowed = numberOfVehiclesAllowed;
    }


    public void addCar(List<Vehicle> vehicle) {
        vehicles.add((Vehicle) vehicle);
    }

    public void addMotocicle(List<Vehicle> vehicle) {
        vehicles.add((Vehicle) vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public void removeVehicleWithBoard(String board) {
        for(Vehicle vehicle : vehicles) {
            if(vehicle.getBoard().equals(board)) {
                vehicles.remove(vehicle);
            }
        }
    }


    /**
     * double purchaseTotal = items.stream()
     *                 .mapToDouble(p -> p.getCostProduct() * p.getQuantityProduct())
     *                 .sum();
     *
     *  Velocidade * 1⁄2 Aceleração / (anguloRotacao* (peso - quantidadeRodas *
     * 100)
     *
     */

    public String reaceWinner() {



        vehicles.stream()
                .mapToDouble(p -> (p.getVelocity() * p.getAcceleration()))
                .sum();


    }
}
