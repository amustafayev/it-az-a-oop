package lesson5.observer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        EventManager eventManager = new EventManager();

        EmailSubscriber test1 = new EmailSubscriber("TEST1", "test1@compamy.com");
        EmailSubscriber test2 = new EmailSubscriber("TEST2", "test1@compamy.com");
        EmailSubscriber test3 = new EmailSubscriber("TEST3", "test1@compamy.com");

        eventManager.subscribe(test1,"OPEN_FILE");
        eventManager.subscribe(test2,"OPEN_FILE");
        eventManager.subscribe(test3,"WRITE_FILE");

        Editor editor = new Editor(eventManager);

        editor.openFile("test.txt");
        editor.write("Hello World");

    }
}
