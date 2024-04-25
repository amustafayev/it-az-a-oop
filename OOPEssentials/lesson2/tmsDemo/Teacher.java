package lesson2.tmsDemo;

public class Teacher extends User {
    //    private int age;
    @Override
    public void login(String name, String password) {
        super.login(name, password);
    }

    @Override
    public void register(String name, String password, String surName) {
        if (this.getName() == null &&
                this.getPassword() == null
                && this.getSurName() == null) {
            this.setName(name);
            this.setPassword(password);
            this.setSurName(surName);
            writeFile("teacher.txt", surName);
            System.out.println("Register olundu!" + this.getName());
        }
    }

    public void register(String name, String password, String surName, int age) {
        if (age > 25) {
            register(name, password, surName);
        }
    }
}
