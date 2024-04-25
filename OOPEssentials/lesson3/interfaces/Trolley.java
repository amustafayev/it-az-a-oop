package lesson3.interfaces;

public class Trolley implements VehicleInterface{
    @Override
    public void start() {
        System.out.println("Trolley starting...");
    }

    @Override
    public void stop() {
        System.out.println("Trolley stoping...");
    }

    @Override
    public void increaseSpeed() {

    }

    @Override
    public void decreaseSpeed() {

    }

    @Override
    public String getCarType() {
        return "TROLLEY";
    }
}
