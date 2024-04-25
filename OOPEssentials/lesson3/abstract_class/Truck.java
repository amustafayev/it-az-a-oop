package lesson3.abstract_class;

public class Truck implements VehicleInterface {

    @Override
    public void start() {
        System.out.println("Truck starting...");
    }

    @Override
    public void stop() {
        System.out.println("Truck stop...");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Truck Increase Speed...");
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Truck Decrease Speed...");
    }

    @Override
    public String getCarType() {
        return "TRUCK";
    }
}
