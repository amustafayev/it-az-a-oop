package lesson3.interfaces;

public class Car implements VehicleInterface {

    @Override
    public void start() {
        System.out.println("Car starting...");
        //
    }

    @Override
    public void stop() {
        System.out.println("Car stop...");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Car increase speed...");
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Car decrease speed...");
    }

    @Override
    public String getCarType() {
        return "CAR";
    }

    public void doDrift(){
        System.out.println("Car drifting...");
    }
}
