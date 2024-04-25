package lesson2.adapter_pattern.adapter;

import lesson2.adapter_pattern.round.RoundToy;
import lesson2.adapter_pattern.square.SquareToy;

public class RoundSquareAdapter extends RoundToy {


    SquareToy squareToy;

    public RoundSquareAdapter( SquareToy squareToy) {
        this.squareToy = squareToy;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow(squareToy.getWith()/2,2)*2);
    }
}
