package cars;

public abstract class Car {
    private int year;
    private String transmission;
    private String model;
    private String color;
    private double power;
    private double weight;

    public Car(int year, String transmission, String model, String color, double power, double weight) {
        this.year = year;
        this.transmission = transmission;
        this.model = model;
        this.color = color;
        this.power = power;
        this.weight = weight;
    }

    public abstract String getInfo();

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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
