package lesson5.chain_of_responsibility;

public class DataLinkLayer extends Processor{
    @Override
    public void reverse(DataDto data) {
        data.setData(
                data
                        .getData()
                        .replace("B", "")
        );
    }

    @Override
    public void processData(DataDto data) {
        data.setData(data.getData() + "B");
    }
}
