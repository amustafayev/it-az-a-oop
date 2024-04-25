package lesson5.observer;

public interface Subscriber {

    void update(String path, String operation);

}
