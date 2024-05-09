package lesson8.visitor;

import lesson8.visitor.shapes.Circle;
import lesson8.visitor.shapes.Dot;
import lesson8.visitor.shapes.Shape;
import lesson8.visitor.shapes.Square;

public class Reporter {

    public void reportAll(Shape shape){
        report((Dot)shape);
    }

    // If removed, compiler errors happens
    public void report(Shape shape) {
        System.out.println("Shape report");
    }


    public void report(Dot dot) {
        System.out.println("Dot report: "+ dot.getX());
    }

    public void report(Square square) {
        System.out.println("Square report: "+ square.getSide());
    }


    public void report(Circle circle) {
        System.out.println("Circle report: " + circle.getX());
    }
}
