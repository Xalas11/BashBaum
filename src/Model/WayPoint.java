package Model;

public class WayPoint {
    private Point a;
    private Point b;

    public WayPoint(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }
}
