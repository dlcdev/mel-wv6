package models;

public class Vehicle {
    private double velocity;
    private double acceleration;
    private double turningAngle;
    private String board;
    private double weight;
    private int wheels;

    public Vehicle() {

    }

    public Vehicle(double velocity, double acceleration, double turningAngle, String board, double weight, int wheels) {
        this.velocity = velocity;
        this.acceleration = acceleration;
        this.turningAngle = turningAngle;
        this.board = board;
        this.weight = weight;
        this.wheels = wheels;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public double getTurningAngle() {
        return turningAngle;
    }

    public void setTurningAngle(double turningAngle) {
        this.turningAngle = turningAngle;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "velocity=" + velocity +
                ", acceleration=" + acceleration +
                ", turningAngle=" + turningAngle +
                ", board='" + board + '\'' +
                ", weight=" + weight +
                ", wheels=" + wheels +
                '}';
    }
}
