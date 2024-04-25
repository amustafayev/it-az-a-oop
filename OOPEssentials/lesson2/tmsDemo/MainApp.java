package lesson2.tmsDemo;

public class MainApp {
    public static void main(String[] args) {
        User user =new User();
        user.register("User","pass","Hasanov");
        user.login("User","pass");

        Teacher teacher = new Teacher();
        teacher.register("Teacher","pass1","SurName",26);

        String.valueOf(23);
        String.valueOf(23L);
        String.valueOf(23f);
        String.valueOf('f');


    }
}
