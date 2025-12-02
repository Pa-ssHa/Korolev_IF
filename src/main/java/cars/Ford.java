package cars;

public class Ford extends Car{

    public Ford(int year, String transmission, String model, String color, double power, double weight) {
        super(year, transmission, model, color, power, weight);
    }

    @Override
    public String getInfo() {
        return "Ford - " + getModel() +
                ". Год выпуска: " + getYear() + ", " +
                "КПП: " + getTransmission() +
                ", цвет: " + getColor() +
                ", мощность: " + getPower() + " л.с., " +
                "вес: " + getWeight() + " кг";
    }
}
