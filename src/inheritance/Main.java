package inheritance;

public class Main {
    public static void main(String[] args) {
//                                      Dog & Animal
/*        Dog dog = new Dog("Husky", 3, "red");
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getColor());
        dog.run();*/
//                                      Circle & Cylinder
/*        Circle circle = new Circle(4.2, "Red");
        System.out.println(circle.toString());
        Circle cylinder = new Cylinder(5.0, "Blue", 5.0);
        System.out.println(cylinder.toString());
        Cylinder cylinder1 = new Cylinder(9.0, "Yellow", 1.0);
        System.out.println(cylinder1.toString());*/
//                                      Point2D & Point3D
        Point2D _3d = new Point3D(3, 4, 5);
        double[] arr = _3d.getXY();
    }
}
