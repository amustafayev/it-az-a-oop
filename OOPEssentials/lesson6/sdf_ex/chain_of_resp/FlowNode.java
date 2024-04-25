package lesson6.sdf_ex.chain_of_resp;

import lesson6.sdf_ex.files.FileManager;
import lesson6.sdf_ex.model.User;

public abstract class FlowNode {
    private FlowNode next;

    public void setNext(FlowNode next) {
        this.next = next;
    }

    public final void doNext(User user) {
        try {
            user.setName("Test");
            processData(user);
            if (next != null) {
                next.doNext(user);
            } else {

                new FileManager();

                System.out.println("Process finished successfully");
            }
        } catch (Exception e) {
            throw new RuntimeException("Process not finished");
        }
    }

    public abstract void processData(User user);
}
