import cars.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Toyota(2010, "Автомат", "Camry", "зеленый", 180.5, 1550.0));
        cars.add(new Toyota(2005, "Автомат", "Corolla", "синий", 130.0, 1200.0));
        cars.add(new BMW(2015, "Автомат", "X5", "черный", 300.0, 2100.0));
        cars.add(new BMW(2003, "Механика", "320i", "зеленый", 150.0, 1400.0));
        cars.add(new Ford(2007, "Автомат", "Focus", "белый", 125.0, 1300.0));
        cars.add(new Lada(2019, "Механика", "Vesta", "черный", 110.0, 1150.0));
        cars.add(new Kia(2020, "Автомат", "Sportage", "Красный", 185.0, 1600.0));
        cars.add(new Toyota(2001, "Механика", "RAV4", "Белый", 145.0, 1350.0));
        cars.add(new Ford(2012, "Автомат", "F-150", "черный", 400.0, 2600.0));
        cars.add(new Lada(2015, "Механика", "Granta", "зеленый", 90.0, 950.0));

        getOldOrNewCars(cars);
        changeColor(cars);
        getCarsAutoTransmission(cars);
    }
    public static void getOldOrNewCars(List<Car> cars) {
        for (Car car : cars) {
            if (car.getYear() > 2006) {
                System.out.println(car.getInfo());
            } else {
                System.out.println("устаревший авто");
            }
        }
    }
    public static void getOldOrNewCars(Car car) {
        if (car.getYear() > 2006) {
            System.out.println(car.getInfo());
        } else {
            System.out.println("устаревший авто");
        }
    }
    public static void changeColor(List<Car> cars){
        for (Car car : cars) {
            if (car.getColor().equalsIgnoreCase("зеленый")) {
                car.setColor("красный");
            }
        }
    }
    public static void changeColor(Car car){
        if (car.getColor().equalsIgnoreCase("зеленый")) {
            car.setColor("красный");
        }
    }
    public static void getCarsAutoTransmission(List<Car> cars){
        for (Car car : cars) {
            if(car.getTransmission().equalsIgnoreCase("автомат")){
                System.out.println(car.getInfo());
            }
        }
    }
}
