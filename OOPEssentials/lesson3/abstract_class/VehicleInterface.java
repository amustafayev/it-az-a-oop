package lesson3.abstract_class;

public interface VehicleInterface {

    void start();

    void stop();

    void increaseSpeed();

    void decreaseSpeed();

    String getCarType();

    default void texnikiBaxis() {
        System.out.println("Texniki baxisa gedir");
    }
}
