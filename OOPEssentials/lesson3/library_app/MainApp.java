package lesson3.library_app;

import lesson3.library_app.lib.AkhundovLibrary;
import lesson3.library_app.lib.BMULibrary;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        //Inheritance
        //Polymorphism

        //Encapsulation
        //Abstraction

//        Library library = new Library();

        BMULibrary bmuLibrary = new BMULibrary();
        AkhundovLibrary akhundovLibrary = new AkhundovLibrary();
        University university = new University(akhundovLibrary,"AKHUNDOV");
        university.provideSemesterBooks(Arrays.asList(23,4,56,7));
        university.reserveSemesterBooks();

    }


}
