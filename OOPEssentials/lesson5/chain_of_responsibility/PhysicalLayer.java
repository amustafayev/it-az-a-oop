package lesson5.chain_of_responsibility;

public class PhysicalLayer extends Processor {
    @Override
    public void reverse(DataDto data) {
        data.setData(
                data
                        .getData()
                        .replace("A", "")
        );
    }

    @Override
    public void processData(DataDto data) {
        data.setData(data.getData() + "A");
        throw new RuntimeException("Some error");
    }
}
