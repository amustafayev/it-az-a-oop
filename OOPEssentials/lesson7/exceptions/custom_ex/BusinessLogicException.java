package lesson7.exceptions.custom_ex;

public class BusinessLogicException extends RuntimeException {
    public BusinessLogicException(String errorMessage){
        super(errorMessage);
    }

}
