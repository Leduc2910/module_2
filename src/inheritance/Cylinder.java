package inheritance;

public class Cylinder extends Circle {
    private double height;


    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getRadius() * this.getRadius() * 3.14 * this.height;
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + this.getRadius() +
                ", color='" + this.getColor() +
                ", height='" + this.height + '\'' +
                '}';
    }
}
