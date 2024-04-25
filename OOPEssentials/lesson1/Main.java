package lesson1;

import lesson1.university.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    //loader
    public static void main(String[] args) {
//        Main.main();
        //javac - Kompayl edir
        //java - run edir
        System.out.println(Arrays.toString(args));
        System.out.println("Hello world");

//        new University();
        String testData = University.TEST_DATA;

        University university = new University();
        String td = university.TEST_DATA_NON_STATIC;
        //Inheritance

        //Encapsulation
//        university.TEST_DATA not working

//             User
//           /     \
//        Muellim  Telebe
        // Ad soyad, id,

        Teacher Efqan = new Teacher();
        Efqan.name = "Efqan";
//        Efqan.salary = 1200;
        Efqan.lessons = List.of(new Lesson());


        //Is a relations
        // Type casting

        String a = "test";

        //8 byte
        // 1010 1111 0001 0100 0000 0000 0100 0100
        long l = 2222444444444444444L;

        //4 byte
        // 1010 1111 0001 0100
        int i = 2222;
        long l2 = (long)i;

        int i2 = (int)l;
        System.out.println(i2);

// ---------------------------------------------------------------

//        Teacher t3 = (Teacher) new User(); => will throw class cast exception
        User t1 = new Teacher();
        var student = (User)new Student();

//        t1.salary => incorrect
//        student.gpa => incorrect

        //Constructors


        Student student1 = new Student();

        System.out.println(student1.gpa);

        User user = new User("ELman","Qasimzade", 1);
        user.registerLessons(new Lesson());
//---------------------------------------------
        Teacher teacher3 = new Teacher(2323,
                "test",
                "test",
                232);

//        System.out.println(teacher3);

        LibraryCard l1 = LibraryCard.getInstance();
        LibraryCard lib2 = LibraryCard.getInstance();
        LibraryCard lib3 = LibraryCard.getInstance();

        System.out.println(l1.hashCode());
        System.out.println(lib3.hashCode());
        System.out.println(lib2.hashCode());

    }

}