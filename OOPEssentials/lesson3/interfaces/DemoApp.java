package lesson3.interfaces;

import java.util.Arrays;

public class DemoApp {

    public static void main(String[] args) {
        Bus bus = new Bus();
        Car car = new Car();
        Truck truck = new Truck();

        Trolley trolley = new Trolley();

        Driver driver = new Driver(Arrays.asList("BUS", "CAR","TROLLEY"), trolley);

        driver.driving();

    }
}
