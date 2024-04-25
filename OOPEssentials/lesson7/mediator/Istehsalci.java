package lesson7.mediator;

public class Istehsalci {

    private String name;
    private int price;

    private IMediator mediator;

    public Istehsalci(String name, int price, IMediator mediator) {
        this.name = name;
        this.price = price;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void mehsulSat(){
        mediator.istehsalcidanMehsulAl(this);
    }
}
