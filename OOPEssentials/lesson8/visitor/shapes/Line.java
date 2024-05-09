package lesson8.visitor.shapes;

import lesson8.visitor.Reporter;

public class Line extends Dot {

    @Override
    public void move(int x, int y) {
        super.move(x, y);
    }

    @Override
    public void draw() {
        super.draw();
    }

    public void accept(Reporter reporter) {
        reporter.report(this);
    }
}
