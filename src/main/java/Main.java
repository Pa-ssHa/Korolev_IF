import transport.*;
import transport.enums.Color;
import transport.enums.Transmission;
import transport.modelsCar.*;
import transport.utils.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Toyota(2010, Transmission.AUTOMATIC, "Camry", Color.GREEN, 180.5, 1550.0));
        cars.add(new Toyota(2005, Transmission.AUTOMATIC, "Corolla", Color.BLUE, 130.0, 1200.0));
        cars.add(new BMW(2015, Transmission.AUTOMATIC, "X5", Color.BLACK, 300.0, 2100.0));
        cars.add(new BMW(2003, Transmission.MANUAL, "320i", Color.GREEN, 150.0, 1400.0));
        cars.add(new Ford(2007, Transmission.AUTOMATIC, "Focus", Color.WHITE, 125.0, 1300.0));
        cars.add(new Lada(2019, Transmission.MANUAL, "Vesta", Color.BLACK, 110.0, 1150.0));
        cars.add(new Kia(2020, Transmission.AUTOMATIC, "Sportage", Color.RED, 185.0, 1600.0));
        cars.add(new Toyota(2001, Transmission.MANUAL, "RAV4", Color.WHITE, 145.0, 1350.0));
        cars.add(new Ford(2012, Transmission.AUTOMATIC, "F-150", Color.BLACK, 400.0, 2600.0));
        cars.add(new Lada(2015, Transmission.MANUAL, "Granta", Color.GREEN, 90.0, 950.0));

        CarUtils.getOldOrNewCars(cars, 2006);
        CarUtils.changeColor(cars, Color.GREEN, Color.RED);
        CarUtils.getCarsByTransmission(cars, Transmission.AUTOMATIC);
        CarUtils.findCarByYearRange(cars, 2010, 2020);
    }
}
