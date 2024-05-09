package lesson8.generics;

import lesson8.visitor.shapes.Line;
import lesson8.visitor.shapes.Shape;

public class ShapeWrapper {

    public <A extends Line> String shapeWrapper(A shape) {
        return "";
    }


}
