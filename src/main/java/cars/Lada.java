package cars;

public class Lada extends Car{

    public Lada(int year, String transmission, String model, String color, double power, double weight) {
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
