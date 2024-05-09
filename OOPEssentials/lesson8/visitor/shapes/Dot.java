package lesson8.visitor.shapes;

import lesson8.visitor.Reporter;

public class Dot implements Shape{

    private Integer x;
    private Integer y;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    public void accept(Reporter reporter) {
        reporter.report(this);
    }
}
