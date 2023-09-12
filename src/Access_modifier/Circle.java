package Access_modifier;

public class Circle {
    private int id;
    private double radius;
    final static double PI = 3.14;
    private static int count = 0;
    private static double maxRadius = 0;
    public static double sumS = 0;

    Circle() {
        count++;
        this.id = count;
        if (maxRadius < this.radius) {
            maxRadius = this.radius;
        }
        sumS += this.getArea();
    }

    Circle(double r) {
        this.radius = r;
        count++;
        this.id = count;
        if (maxRadius < this.radius) {
            maxRadius = this.radius;
        }
        sumS += this.getArea();
    }

    public double getRadius() {
        return this.radius;
    }

    public int getId() {
        return this.id;
    }

    public double getPerimeter() {
        return 2 * this.radius * PI;
    }

    public double getArea() {
        return PI * this.radius * this.radius;
    }

    public static int getCount() {
        return count;
    }
    public static double getMaxRadius() {
        return maxRadius;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "id=" + this.id +
                ", radius=" + this.radius +
                '}';
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle cl = new Circle();
        System.out.println(cl.toString());
        Circle cl2 = new Circle(15);
        System.out.println(cl2.toString());
        Circle cl3 = new Circle(10);
        System.out.println(cl3.toString());
        System.out.println("Numbers of circle: " + Circle.getCount());
        System.out.println("Max radius: " + Circle.getMaxRadius());
        System.out.println("Sum area of circle: " + Circle.sumS);

    }
}
