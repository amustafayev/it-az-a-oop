package lesson5.gc;

public class Main {


    public static void main(String[] args) {
        createCustomer();

        Customer test2 = new Customer("test2");

        test2 = new Customer("testtest");


        //--------------------------

        String str1 = "Python";
        String str2 = "Java";
        String str3 = "Python";
        String str4 = new String("Python").intern();

        if (str1 == str3) {
            System.out.println("Str1  and str3 is the same obj");
        }

        if (str1.equals(str3)) {
            System.out.println("Str1  and str3 is the same content");
        }

        System.out.println("------------------------------");

        if (str1 == str4) {
            System.out.println("Str1  and str4 is the same obj");
        }

        if (str1.equals(str4)) {
            System.out.println("Str1  and str4 is the same content");
        }
        System.out.println("------------------------------");

        String a = "75";
        String b = new Integer(75).toString();

        if (a == b) {
            System.out.println("A equals B");
        }
        if (a.equals(b)) {
            System.out.println("A equals B same content");
        }

        //--------


        String s = "test";
        String refS = s;
        s = s + "TEST";
        s = s.replace("t","");

        if (refS == s) {
            System.out.println("refs equals s");
        }

        System.out.println(s);

    }

    private static void createCustomer() {
        Customer test = new Customer("test");
    }
}
