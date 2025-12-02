package cars;

public class Toyota extends Car{

    public Toyota(int year, String transmission, String model, String color, double power, double weight) {
        super(year, transmission, model, color, power, weight);
    }

    @Override
    public String getInfo() {
        return "Toyota - " + getModel() +
                ". Год выпуска: " + getYear() + ", " +
                "КПП: " + getTransmission() +
                ", цвет: " + getColor() +
                ", мощность: " + getPower() + " л.с., " +
                "вес: " + getWeight() + " кг";
    }
}
