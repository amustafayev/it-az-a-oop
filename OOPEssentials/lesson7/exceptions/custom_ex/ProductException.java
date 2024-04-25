package lesson7.exceptions.custom_ex;

public class ProductException extends BusinessLogicException {
    private String exCode;

    public ProductException(String errorMessage, String exCode) {
        super(errorMessage);
        this.exCode = exCode;
    }

    public String getExceptionCode() {
        return exCode;
    }
}
