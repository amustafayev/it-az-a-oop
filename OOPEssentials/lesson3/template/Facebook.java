package lesson3.template;

import java.util.Random;

public class Facebook extends Network {
    @Override
    boolean login(String username, String password) {
        System.out.println("Attempting login facebook...");
        return new Random().nextInt(5) > 3;
    }

    @Override
    boolean sendData(String data) {
        System.out.println("Sending data...");
        return new Random().nextInt(5) > 3;
    }

    @Override
    void logout() {
        System.out.println("Logging out...");
    }
}
