package lesson7.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements IMediator{

    private final List<Satici> saticilar;
    private final List<Istehsalci> istehsalcilar;

    public Mediator() {

        saticilar = new ArrayList<>();
        istehsalcilar = new ArrayList<>();

    }

    @Override
    public void addSatici(Satici satici) {
        saticilar.add(satici);
    }

    @Override
    public void addIstehsalci(Istehsalci istehsalci) {
        istehsalcilar.add(istehsalci);
    }

    @Override
    public void istehsalcidanMehsulAl(Istehsalci istehsalci) {
        Satici enUygunSatici = enUygunSaticiTap();

        satishEt(istehsalci, enUygunSatici);

    }

    @Override
    public void saticiyaMehsulVer(Satici satici) {
        Istehsalci enUygunIstehsalci
                = enUygunIstehsalciTap();

        satishEt(enUygunIstehsalci, satici);
    }

    private Istehsalci enUygunIstehsalciTap() {

        Istehsalci enUygun = null;

        for (Istehsalci i : istehsalcilar) {
            if (enUygun == null ||
                    i.getPrice() < enUygun.getPrice()){
                enUygun = i;
            }
        }

        return enUygun;

    }

    private void satishEt(Istehsalci istehsalci, Satici enUygunSatici) {
        System.out.printf("%s adli istehsalci %s adli " +
                "saticiya %d manata alma satdi.\n",
                istehsalci.getName(),
                enUygunSatici.getName(),
                enUygunSatici.getPrice());
    }

    private Satici enUygunSaticiTap() {
        Satici enUygun = null;

        for (Satici s : saticilar) {
            if (enUygun == null ||
                    s.getPrice() > enUygun.getPrice()){
                enUygun = s;
            }
        }

        return enUygun;
    }


}
