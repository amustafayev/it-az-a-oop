package lesson8.visitor;

import lesson8.visitor.shapes.Circle;
import lesson8.visitor.shapes.Dot;
import lesson8.visitor.shapes.Line;
import lesson8.visitor.shapes.Square;

public class MainApp {
    public static void main(String[] args) {


        Reporter reporter = new Reporter();

        reporter.reportAll(new Dot());
        reporter.reportAll(new Square());
        reporter.reportAll(new Circle());
        reporter.reportAll(new Line());
        System.out.println("-=-=======================-----------------");

        reporter.report(new Dot());
        reporter.report(new Line());

        System.out.println("-=-=======================-----------------");

        Dot dot = new Dot();
        Square square = new Square();

        dot.accept(reporter);
        square.accept(reporter);
    }
}
