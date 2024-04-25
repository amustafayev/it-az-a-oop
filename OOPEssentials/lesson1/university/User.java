package lesson1.university;

import java.util.ArrayList;
import java.util.List;

//final public class => extend etmeye qoymur
 public class User extends Object {
    public String name;
    public String surname;
    public int id;
    public List<Lesson> lessons = new ArrayList<>();
    public User(){}

    public User(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    //final public void => prevent function overriding
    final public void registerLessons(Lesson lesson){
        this.lessons.add(lesson);
    }
}
