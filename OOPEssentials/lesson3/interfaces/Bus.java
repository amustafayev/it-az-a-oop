package lesson3.interfaces;

public class Bus implements VehicleInterface {

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void increaseSpeed() {

    }

    @Override
    public void decreaseSpeed() {

    }

    @Override
    public String getCarType() {
        return "BUS";
    }

    @Override
    public void texnikiBaxis() {
        System.out.println("Bus Texniki baxis kecirmek");
    }
}
