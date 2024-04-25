package lesson2;

public class Demo {

    //Polymorphism
    //Casting => downcasting
    //Overriding
    //Overloading

    public static void main(String[] args) {

        Student student1 = new Student("Test1",
                        "TestUsername1");

//        student1.getName();
        Student student2 = new Student("Test1",
                "TestUsername1");

        System.out.println(student1.getClass());
        System.out.println(student1.CustomCompare(student2));

        //Class cast exception
//        Object obj = new Object();
//
//        Student s = (Student) obj;

        Object student2Obj = (Object) student2;
        Student s = (Student)student2Obj;

        System.out.println("-------------------");
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student1.equals(student2Obj));



        //      User
        //Student, Teacher

        // User => name, surname, password
        //register => user.txt
        // login => user.txt


        // Student/Teacher =>
        // Register => student/teacher.txt
        // Login => student/teacher.txt

        //register
            //writeFile
        //login
            //readFile
        //
    }
}
