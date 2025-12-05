package transport.modelsCar;

import transport.Car;
import transport.enums.Color;
import transport.enums.Transmission;

public class Lada extends Car {

    public Lada(int year, Transmission transmission, String model, Color color, double power, double weight) {
        super(year, transmission, model, color, power, weight);
    }

    @Override
    public String getInfo() {
        return "Lada - " + getModel() +
                ". Год выпуска: " + getYear() + ", " +
                "КПП: " + getTransmission() +
                ", цвет: " + getColor() +
                ", мощность: " + getPower() + " л.с., " +
                "вес: " + getWeight() + " кг";
    }
}
