package lesson2.adapter_pattern.round;

import lesson2.adapter_pattern.square.SquareToy;

public class RoundBox {

    double radius;

    public RoundBox(double radius) {
        this.radius = radius;
    }

    public boolean uygunGelirmi(RoundToy roundToy){
        if (roundToy.getRadius() > this.radius){
            return false;
        }
        return true;
    }
}
