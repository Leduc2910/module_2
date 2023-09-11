package Class_object;

public class Rectangle {
    double length;
    double width;

    public Rectangle() {
    }

    public Rectangle(double lengthIn, double widthIn) {
        this.length = lengthIn;
        this.width = widthIn;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
    public double getPerimeter() {
        return (this.length+this.width)/2;
    }
    public double getArea() {
        return this.length*this.width;
    }
}
