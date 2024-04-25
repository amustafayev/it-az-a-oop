package lesson3.template;

public class Twitter extends Network {
    @Override
    boolean login(String username, String password) {
        return false;
    }

    @Override
    boolean sendData(String data) {
        return false;
    }

    @Override
    void logout() {

    }
}
