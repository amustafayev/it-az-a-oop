package lesson5.observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Editor {
    EventManager eventManager;

    public Editor(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    private File file = null;

    public boolean openFile(String path) {
        file = new File(path);
        eventManager.notify("OPEN_FILE", path);
        return file.exists();
    }

    public void write(String text) throws IOException {
        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write(text);
        fileWriter.close();

        eventManager.notify("WRITE_FILE", file.getPath());
    }
}
