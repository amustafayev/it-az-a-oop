package lesson7.exceptions.custom_ex;

public class ProductNotFoundException extends ProductException{
    private String exCode;
    public ProductNotFoundException(String errorMessage, String exCode) {
        super(errorMessage,exCode);
        this.exCode = exCode;
    }
}
