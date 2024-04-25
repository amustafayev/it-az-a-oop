package lesson3.library_app;

import lesson3.library_app.lib.LibraryInterface;

import java.util.List;

public class University {

    //Coupling, Decoupling

    //has-a relation
    LibraryInterface library;

    private String studentLibraryChoice;

    List<Integer> semesterBookIds;

    public University(LibraryInterface library, String studentLibraryChoice) {
        this.library = library;
        this.studentLibraryChoice = studentLibraryChoice;
    }

    public void reserveSemesterBooks() {
        for (int i = 0; i < semesterBookIds.size(); i++) {
            library.reserveABook(semesterBookIds.get(i));
        }
    }

    public void provideSemesterBooks(List<Integer> semesterBookIds) {
        this.semesterBookIds = semesterBookIds;
    }


    // Inside Library class
    //cause Coupling
//    void reverseABook(int bookId) {
//
//    }


}
