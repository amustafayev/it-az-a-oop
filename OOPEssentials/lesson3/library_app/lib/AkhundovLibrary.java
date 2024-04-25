package lesson3.library_app.lib;

public class AkhundovLibrary implements LibraryInterface, Returnable {
    @Override
    public void reserveABook(int bookId) {
        System.out.println("Reserve book in Akhundov");
    }

    @Override
    public void returnABook(int bookId) {
        System.out.println("Return book in Akhundov");
    }

    @Override
    public void listReservedBooks() {

    }
}
