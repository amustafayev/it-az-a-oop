package lesson7.exceptions.custom_ex;

public class UserNotFoundException extends UserExceptions{
    public UserNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
