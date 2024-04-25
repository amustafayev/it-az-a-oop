package lesson5.gc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GCExample {

    private static List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < 100000000; i++) {
            Customer customer = new Customer("test" + new Random().nextInt(266666));
            customers.add(customer);
        }

    }
}
