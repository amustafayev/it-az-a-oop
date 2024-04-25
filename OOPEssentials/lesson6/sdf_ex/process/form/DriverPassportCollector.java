package lesson6.sdf_ex.process.form;

import lesson6.sdf_ex.chain_of_resp.FlowNode;
import lesson6.sdf_ex.model.User;

public class DriverPassportCollector extends FlowNode {
    @Override
    public void processData(User user) {
        System.out.println("Enter passport data");
    }
}
