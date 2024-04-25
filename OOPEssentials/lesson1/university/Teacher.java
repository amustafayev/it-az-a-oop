package lesson1.university;

public class Teacher extends User {
    private int salary;
    Library library;

    public Teacher(){
        super();
    }

    public Teacher(int salary, String name,String surname,int id) {
        super(name, surname,id);
//        this();
        this.salary = salary;
    }

    public void orderBook(){
//        this.name;
        registerLessons(new Lesson());
        library.orderBook(this);
    }

//    @Override
//    public String toString() {
//        return this.name + " " + this.surname;
//    }
}
