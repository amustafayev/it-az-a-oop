package lesson4.template_design_pattern.networks;

public abstract class Network {

    //Network:
//  Ortaq funksionalliqlar:
    //login
    //logout
    //sendData
    //register

    //--Another example--
//    Document:
    //Excel
    //Docx
    //Csv

    //readFile
    //parseFile
    //processData
    //writeData

    public void sharePost(String data) {
        registerUser();
        tryToLogin();
        if (userLoggedIn()) {
            sendData(data);
        }
    }

    public abstract void sendData(String data);

    public abstract void tryToLogin();

    public abstract void registerUser();

    public abstract boolean userLoggedIn();
}
