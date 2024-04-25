package lesson3.library_app.lib;

public class AliNinoLibrary implements LibraryInterface {

    @Override
    public void reserveABook(int bookId) {
        System.out.println("AliNino reserve a book");
    }

    @Override
    public void listReservedBooks() {

    }
}
