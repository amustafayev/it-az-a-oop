package lesson3.abstract_class;


public abstract class ElectricCar implements VehicleInterface {

    @Override
    public final void start() {
        anyNewMethod();
        System.out.println("Electric car starting...");
    }

    public abstract void anyNewMethod();
}
