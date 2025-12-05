package transport.modelsCar;

import transport.Car;
import transport.enums.Color;
import transport.enums.Transmission;

public class Kia extends Car {

    public Kia(int year, Transmission transmission, String model, Color color, double power, double weight) {
        super(year, transmission, model, color, power, weight);
    }

    @Override
    public String getInfo() {
        return "Kia - " + getModel() +
                ". Год выпуска: " + getYear() + ", " +
                "КПП: " + getTransmission() +
                ", цвет: " + getColor() +
                ", мощность: " + getPower() + " л.с., " +
                "вес: " + getWeight() + " кг";
    }
}
