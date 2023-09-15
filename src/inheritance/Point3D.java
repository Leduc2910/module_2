package inheritance;

public class Point3D extends Point2D {
    private double z;

    Point3D() {
    }

    Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double[] getXYZ() {
        double[] arr = {getX(), getY(), this.z};
        return arr;
    }

    public void setXYZ(double x, double y, double z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                ", z=" + this.z +
                '}';
    }
}
