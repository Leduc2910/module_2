package inheritance;

public class Point2D {
    private double x = 0;
    private double y = 0;
    private double[] arr;

    Point2D() {
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double[] getXY() {
        this.arr = {this.x, this.y};
        return arr;
    }

    public void setXY(double x, double y) {

    }
}
