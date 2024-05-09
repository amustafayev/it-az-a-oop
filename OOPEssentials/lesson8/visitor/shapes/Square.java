package lesson8.visitor.shapes;

import lesson8.visitor.Reporter;

public class Square extends Line{
    private int side;

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void accept(Reporter reporter) {
        reporter.report(this);
    }
}
