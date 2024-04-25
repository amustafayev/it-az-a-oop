package lesson5.gc;

public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Customer " + this.name + " garbage collected");;
    }
}
