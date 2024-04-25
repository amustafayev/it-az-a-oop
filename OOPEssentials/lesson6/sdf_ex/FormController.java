package lesson6.sdf_ex;

import lesson6.sdf_ex.chain_of_resp.FlowNode;
import lesson6.sdf_ex.model.User;
import lesson6.sdf_ex.process.form.*;

public class FormController {

    FlowNode flowNode;

    public FormController() {

        flowNode = new DriverLicenseCollector();

        DriverPassportCollector driverPassportCollector = new DriverPassportCollector();
        flowNode.setNext(driverPassportCollector);

        GeneralInfoCollector generalInfoCollector = new GeneralInfoCollector();
        driverPassportCollector.setNext(generalInfoCollector);

        PaymentDetailsCollector paymentDetailsCollector = new PaymentDetailsCollector();
        generalInfoCollector.setNext(paymentDetailsCollector);

        UniversityDataCollector universityData = new UniversityDataCollector();
        paymentDetailsCollector.setNext(universityData);

    }

    public void startForm(User user) {
//        user = new User();
        flowNode.doNext(user);
    }

}
