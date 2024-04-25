package lesson2;

import java.time.LocalDateTime;
import java.util.Objects;

public class Student extends Object {

    private String name;
    private String surName;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Student(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public boolean CustomCompare(Student otherStudent) {

        if (otherStudent.name.equals(this.name)
                && otherStudent.surName.equals(this.surName)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(name, student.name) && Objects.equals(surName, student.surName);

        if (this.hashCode() == o.hashCode()){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }
}
