package lesson3.library_app.lib;

public class BMULibrary implements LibraryInterface, Returnable {

    @Override
    public void reserveABook(int bookId) {
        System.out.println("Reserve a book from BMU: " + bookId);
    }

    @Override
    public void returnABook(int bookId) {
        System.out.println("Return a book to BMU: " + bookId);

    }

    @Override
    public void listReservedBooks() {

    }
}
