package lesson2.tmsDemo;

public class User {
    private  int id;
    private String name;
    private String surName;
    private String password;

    public User() {
    }

    public void writeFile(String fileName,String surName){
        System.out.println("Fayla yazildi"+surName+":"+fileName);
    }
    public void readFile(String fileName,String name){
        System.out.println("Axtarilan "+name+" tapildi:"+fileName);
    }
    public void register(String name,String password,String surName){
        if(this.name == null && this.password == null &&this.surName==null){
            this.name = name;
            this.surName=surName;
            this.password = password;
            writeFile("user.txt",surName);
            System.out.println("Register olundu!"+this.surName);
        }
    }
    public void login(String name,String password){
        readFile("user.txt",name);
        if(this.name==name && this.password==password){
            System.out.println("Login is succesfully");
        } else {
            System.out.println("Failure");
        }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
