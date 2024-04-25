package lesson7.mediator;

public class Satici {

    private String name;
    private int price;

    private IMediator mediator;

    public Satici(String name, int price, IMediator mediator) {
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

    public void mehsulAl(){
        mediator.saticiyaMehsulVer(this);
    }

}
