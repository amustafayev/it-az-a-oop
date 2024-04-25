package lesson7.mediator;

public class Main {

    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        Istehsalci shamil =
                new Istehsalci("Shamil", 3, mediator);
        Istehsalci deniz =
                new Istehsalci("Deniz", 4, mediator);

        Satici ilyas =
                new Satici("Ilyas", 5, mediator);
        Satici senan =
                new Satici("Senan", 8, mediator);


        mediator.addIstehsalci(shamil);
        mediator.addIstehsalci(deniz);

        mediator.addSatici(ilyas);
        mediator.addSatici(senan);

        shamil.mehsulSat();
        ilyas.mehsulAl();
    }

}
