package lesson3.template;

public abstract class Network {

    public boolean isLoggedIn = false;
    public int tryCount = 0;

    public void shareData(String data) {
        //call login
        if (tryCount > 3) {
            System.out.println("Cant share data!");
            return;
        }
        if (isLoggedIn) {
            boolean sent = sendData(data);
            if (sent) {
                isLoggedIn = false;
                tryCount = 0;
                logout();
            } else {
                tryCount++;
                shareData(data);
            }
        }
    }

    abstract boolean login(String username, String password);

    abstract boolean sendData(String data);

    abstract void logout();
}
