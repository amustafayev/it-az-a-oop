package lesson6.sdf_ex.process.form;

import lesson6.sdf_ex.chain_of_resp.FlowNode;
import lesson6.sdf_ex.model.DriverLicense;
import lesson6.sdf_ex.model.User;

public class DriverLicenseCollector extends FlowNode {
    @Override
    public void processData(User user) {
        System.out.println("Enter driver license data");
        String serialNum = "3457898u5y56";
        DriverLicense driverLicense = new DriverLicense(serialNum);
        user.setDriverLicense(driverLicense);
    }
}
