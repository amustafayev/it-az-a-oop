package lesson4.jmm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {


    public static void main(String[] args) {

        int a = 5;
        int d = a + 34;
        int e = test1(d);
        String test = new String("tests");
        int[] ints = new int[]{3, 4, 56, 6};
        modifyArray(ints);
        System.out.println(Arrays.toString(ints));


        System.out.println("------------------------------");


        Person person = new Person(43);

        List<Person> people = new ArrayList<>();
        people.add(person);

        System.out.println(people);
        modifyAge(people);
        System.out.println(people);


        System.out.println("-------------------------");

        String s1 = "test";
        String s2 = "test";


        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        String s3 = new String("test");
        System.out.println(s1 == s3);
        String accountNo = "AZN2324443PAHA232";
        cantModyfyAcc(accountNo);
        transfewrMoney(accountNo, 1000000);
    }

    private static void cantModyfyAcc(String accountNo) {
        accountNo = "newacxc";
    }

    private static void transfewrMoney(String accountNo, int i) {

    }

    private static void modifyAge(List<Person> people) {
        Person person = people.get(0);
        person.setAge(21);
    }

    private static void modifyArray(int[] data) {
//        data = new int[]{34,43,3};

        data[0] = 111;

    }

    private static int test1(int j) {
        int k = j + 4;
        return k;
    }
}
