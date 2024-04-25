package lesson3.abstract_class;

public class ElectricCarTesla extends ElectricCar {

    @Override
    public void stop() {
        System.out.println("Tesla starting");
    }

    @Override
    public void increaseSpeed() {
        anyNewMethod();
    }

    @Override
    public void decreaseSpeed() {

    }

    @Override
    public String getCarType() {
        return "ELECTRIC_TESLA";
    }

    @Override
    public void anyNewMethod() {

    }
}
