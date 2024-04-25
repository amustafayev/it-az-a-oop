package lesson5.observer;

public class EmailSubscriber implements Subscriber {
    private String name;
    private String email;

    public EmailSubscriber(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void update(String path, String operation) {
        System.out.println(name + " get notified in email: " + email + " for OP: "+operation);
    }
}
