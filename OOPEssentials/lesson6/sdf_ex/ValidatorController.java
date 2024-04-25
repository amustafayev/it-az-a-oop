package lesson6.sdf_ex;

import lesson6.sdf_ex.chain_of_resp.FlowNode;
import lesson6.sdf_ex.process.validator.DriverLicenseValidator;
import lesson6.sdf_ex.process.validator.PassportValidator;

public class ValidatorController {

    private FlowNode first;

    public ValidatorController(){
        first = new DriverLicenseValidator();
        PassportValidator passportValidator = new PassportValidator();

        first.setNext(passportValidator);
        passportValidator.setNext(null);

        //TODO: create nodes and link them


    }
}
