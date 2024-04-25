package lesson7.exceptions.custom_ex;

public class UserExceptions extends BusinessLogicException{
    public UserExceptions(String errorMessage) {
        super(errorMessage);
    }
}
