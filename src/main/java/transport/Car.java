package transport;

import transport.enums.Color;
import transport.enums.Transmission;

public abstract class Car {
    private int year;
    private Transmission transmission;
    private String model;
    private Color color;
    private double power;
    private double weight;

    public abstract String getInfo();

    public Car(int year, Transmission transmission, String model, Color color, double power, double weight) {
        this.year = year;
        this.transmission = transmission;
        this.model = model;
        this.color = color;
        this.power = power;
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
