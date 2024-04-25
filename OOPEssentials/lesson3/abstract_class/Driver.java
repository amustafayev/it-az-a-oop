package lesson3.abstract_class;

import java.util.List;

public class Driver {

    private List<String> category;
    private VehicleInterface vehicle;

    public Driver(List<String> category, VehicleInterface vehicle) {
        this.category = category;
        this.vehicle = vehicle;
    }

    public void driving() {

        if (category.contains(vehicle.getCarType())) {
            vehicle.getCarType();
            vehicle.start();

            for (int i = 0; i < 3; i++) {
                vehicle.increaseSpeed();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            for (int i = 0; i < 3; i++) {
                vehicle.decreaseSpeed();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            vehicle.stop();

        }else {
            System.out.println("You cant drive this vehicle: "+vehicle.getCarType());
        }
    }

}
