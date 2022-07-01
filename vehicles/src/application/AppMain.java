package application;

import models.Garage;
import models.Vehicles;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        List<Vehicles> listCar = new ArrayList<>();

        listCar.add(new Vehicles("Ford", "Fiesta", 1000.00));
        listCar.add(new Vehicles("Ford", "Focus", 1200.00));
        listCar.add(new Vehicles("Ford", "Explorer", 2500.00));
        listCar.add(new Vehicles("Fiat", "Uno", 500.00));
        listCar.add(new Vehicles("Fiat", "Cronos", 1000.00));
        listCar.add(new Vehicles("Fiat", "Torino", 1250.00));
        listCar.add(new Vehicles("Chevrolet", "Aveo", 1250.00));
        listCar.add(new Vehicles("Chevrolet", "Spin", 2500.00));
        listCar.add(new Vehicles("Toyota", "Corola", 1200.00));
        listCar.add(new Vehicles("Toyota", "Fortuner", 3000.00));
        listCar.add(new Vehicles("Renault", "Logan", 950.00));


        Garage garages = new Garage(1, listCar);
        System.out.println("Garage" + garages);


        List<Vehicles> vehicles = Garage.getVehicles();

        // Return all data

        System.out.println("-- All data Vihicles --");
        vehicles.stream()
                .forEach(System.out::println);

        // Return values sorted by price from lowest to highest
        System.out.println("\n-- Sorted by Price --");
        vehicles.stream()
                .sorted()
                .forEach(System.out::println);

        // Return values sorted by brand
        System.out.println("\n-- Sorted by Brand --");
        vehicles.stream()
                .sorted((v1, v2) -> v1.getBrand().compareTo(v2.getBrand()))
                .forEach(System.out::println);

        System.out.println("\n-- Lower Price --");
        // Return values filtered by lower price
        vehicles.stream()
                .filter(v1 -> v1.getPrice() < 1000.00)
                .forEach(System.out::println);

        System.out.println("\n-- Higher Price --");
        // Return values sorted by top price
        vehicles.stream()
                .filter(v1 -> v1.getPrice() > 1000.00)
                .forEach(System.out::println);

        // End
    }
}
