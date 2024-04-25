package lesson7.exceptions.custom_ex;

public class UserInvalidException extends UserExceptions{
    public UserInvalidException(String errorMessage) {
        super(errorMessage);
    }
}
