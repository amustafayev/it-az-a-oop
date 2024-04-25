package lesson5.chain_of_responsibility;

public abstract class Processor {

    private Processor nextProcess;

    public void process(DataDto data) {
        try {
            processData(data);
            if (nextProcess != null) {
                nextProcess.process(data);
            }
        } catch (Exception e) {
            reverse(data);
        }

    }

    public abstract void reverse(DataDto data);

    public abstract void processData(DataDto data);
}
