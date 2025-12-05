package transport.utils;

import transport.Car;
import transport.enums.Color;
import transport.enums.Transmission;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;

public class CarUtils {

    private final static Logger log = Logger.getLogger(CarUtils.class.getName());

    public static void getOldOrNewCars(List<Car> cars, int year) {
        if (!isValidYear(year)) {
            return;
        }
        for (Car car : cars) {
            getOldOrNewCars(car, year);
        }
    }

    public static void getOldOrNewCars(Car car, int year) {
        if (!isValidYear(year)) {
            return;
        }
        if (!isValidYearCar(car)) {
            return;
        }
        if (car.getYear() > year) {
            log.info("Автомобиль младше " + year + " года: " + car.getInfo());
        } else {
            log.info("Устаревший авто: " + car.getModel() + " (" + car.getYear() + ")");
        }
    }

    public static void changeColor(List<Car> cars, Color startColor, Color endColor) {
        for (Car car : cars) {
            changeColor(car, startColor, endColor);
        }
    }

    public static void changeColor(Car car, Color startColor, Color endColor) {
        if (!isValidYearCar(car)) {
            return;
        }
        if (car.getColor().equals(startColor)) {
            car.setColor(endColor);
            log.info("Изменение цвета с " + startColor + " на " + endColor + ": " + car.getModel() + " (" + car.getYear() + ")");
        }
    }

    public static void getCarsByTransmission(List<Car> cars, Transmission transmission) {
        for (Car car : cars) {
            if (!isValidYearCar(car)) {
                continue;
            }
            if (car.getTransmission().equals(transmission)) {
                log.info("Автомобиль с КПП " + transmission + ": " + car.getInfo());
            }
        }
    }

    public static void findCarByYearRange(List<Car> cars, int startYear, int endYear) {
        if (!isValidYear(startYear) || !isValidYear(endYear)) {
            return;
        }
        if (startYear > endYear) {
            log.warning("Год начала(" + startYear + ") диапазона больше, чем год конца(" + endYear + ") диапазона");
            return;
        }
        for (Car car : cars) {
            if (!isValidYearCar(car)) {
                continue;
            }
            if (car.getYear() >= startYear && car.getYear() <= endYear) {
                log.info("Автомобиль с годом выпуска с " + startYear + " до " + endYear + ": " + car.getInfo());
            }
        }
    }

    private static boolean isValidYearCar(Car car) {
        if (car.getYear() >= 1886 && car.getYear() <= LocalDate.now().getYear()) {
            return true;
        }
        log.warning("Автомобиль (" + car.getModel() + "-" + car.getYear() + ") не подходит по году");
        return false;
    }

    private static boolean isValidYear(int year) {
        if (year >= 1886 && year <= LocalDate.now().getYear()) {
            return true;
        }
        log.warning("Введен неверный год (" + year + ")");
        return false;
    }
}
