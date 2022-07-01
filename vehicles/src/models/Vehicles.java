package models;

public class Vehicles implements Comparable<Vehicles> {
    private String model;
    private String brand;
    private double price;

    public Vehicles(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Model: " + model);
        sb.append(" | Brand: " + brand);
        sb.append(" Price: " + price);

        return sb.toString();
    }

    @Override
    public int compareTo(Vehicles otherVehicles) {
        if (this.price < otherVehicles.getPrice()) {
            return -1;
        } else {
            if (this.price > otherVehicles.getPrice()) {
                return 1;
            }
            return 0;
        }
    }
}
