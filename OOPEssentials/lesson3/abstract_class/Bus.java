package lesson3.abstract_class;

public class Bus implements VehicleInterface {

    @Override
    public void start() {

    }

    void doSmt(){

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
