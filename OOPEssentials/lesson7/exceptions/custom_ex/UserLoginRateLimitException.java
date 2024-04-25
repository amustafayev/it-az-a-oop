package lesson7.exceptions.custom_ex;

public class UserLoginRateLimitException extends UserExceptions{
    public UserLoginRateLimitException(String errorMessage) {
        super(errorMessage);
    }
}
