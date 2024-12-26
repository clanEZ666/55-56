package CarNotFunction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "Red"));
        cars.add(new Car("BMW", "Blue"));
        cars.add(new Car("LADA", "Green"));
        cars.add(new Car("Mercedes CLS63", "Black"));


        try {

            Car foundCar = getCar(cars, "LADA", "Red");
            System.out.println("Найдена машина: " + foundCar);
        } catch (CarNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {

            Car foundCar = getCar(cars, "LADA", "Green");
            System.out.println("Найдена машина: " + foundCar);
        } catch (CarNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }

    public static Car getCar(List<Car> cars, String model, String color) {
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model) && car.getColor().equalsIgnoreCase(color)) {
                return car;
            }
        }

        throw new CarNotFoundException("Машина '" + model + "', цвет='" + color + "' в списке не найдена.");
    }
}




