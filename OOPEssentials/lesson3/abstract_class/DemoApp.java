package lesson3.abstract_class;


import java.util.Arrays;

public class DemoApp {

    public static void main(String[] args) {
        Bus bus = new Bus();
        Car car = new Car();
        Truck truck = new Truck();

        Trolley trolley = new Trolley();

        VehicleInterface electricCarTesla = new ElectricCarTesla();

        Driver driver = new Driver(Arrays.asList("BUS", "CAR","TROLLEY","ELECTRIC_TESLA"), electricCarTesla);

        driver.driving();


    }
}
