package lesson1.university;

import java.util.Objects;

public class LibraryCard {

    //Singleton Design Pattern
    static LibraryCard instance = null;

    public static LibraryCard getInstance(){
        if (instance == null){
            instance = new LibraryCard();
            return instance;
        }

        if (instance.inUse){
            System.out.println("Library card was using by other user");
        }
            return instance;
    }
    //416158554
    //1679009185
    String libCardNo = "45435vcdsf";
    boolean inUse = false;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryCard that = (LibraryCard) o;
        return inUse == that.inUse && Objects.equals(libCardNo, that.libCardNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libCardNo, inUse);
    }

    private LibraryCard(){

    }
}
