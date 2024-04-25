package lesson2.adapter_pattern;

import lesson2.adapter_pattern.adapter.RoundSquareAdapter;
import lesson2.adapter_pattern.round.RoundBox;
import lesson2.adapter_pattern.round.RoundToy;
import lesson2.adapter_pattern.square.SquareToy;

public class DemoApp {

    public static void main(String[] args) {
        RoundBox roundBox = new RoundBox(4.6);

        RoundToy roundToy = new RoundToy(3.5);

        System.out.println(roundBox.uygunGelirmi(roundToy));

        SquareToy squareToy = new SquareToy(45);

        RoundSquareAdapter roundSquareAdapter = new RoundSquareAdapter(squareToy);
        System.out.println(roundBox.uygunGelirmi(roundSquareAdapter));

    }
}
