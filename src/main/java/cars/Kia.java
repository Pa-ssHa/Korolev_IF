package cars;

public class Kia extends Car{

    public Kia(int year, String transmission, String model, String color, double power, double weight) {
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
