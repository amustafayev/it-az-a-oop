package lesson4.jmm;

public class Person {
    int age;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
