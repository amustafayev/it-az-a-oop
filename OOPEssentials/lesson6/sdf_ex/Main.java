package lesson6.sdf_ex;


import lesson6.sdf_ex.model.User;

public class Main {

    public static void main(String[] args) {
        // Rent A Car
        // User => Name,surname, driver license
        // Cars=> Model, owner, price, discount

        // CarsManagementAdmin => add to store, rent, sent to repair


        // CarsWebsite => User request to rent a car
        //  -> Fill The Form
        //     -> Driver Passport data
        //     -> General info data
        //     -> Driver License data
        //     -> Card Details data
        //  -> User ID check
        //  -> User Driver License Check
        //  -> User Driver Validity
        //  -> User Rented Car History
        //  -> Payment check

        //CarsWebsite -> return a car
        // -> Identifier
        // -> Car penalty(cerime)
        // -> Fetch Form Data
        // -> Car damage(zerer)
        // -> return time

        FormController formController = new FormController();
        User user = new User();
        formController.startForm(user);
        System.out.println(user);

        new ValidatorController();
    }

}
