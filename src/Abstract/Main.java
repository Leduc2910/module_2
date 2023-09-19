package Abstract;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(4.0);
        shapes[1] = new Rectangle(3.0, 5.0);
        shapes[2] = new Circle(3.9);

        for (int i = 0; i < shapes.length; i++) {
            double randPercent = rand.nextInt(100) + 1;
            System.out.println(randPercent);
            if (shapes[i] instanceof Circle) {
                System.out.println("Trước khi thay đổi: " + ((Circle) shapes[i]).getArea());
            } else {
                System.out.println("Trước khi thay đổi: " + ((Rectangle) shapes[i]).getArea());
            }
            shapes[i].resize(randPercent);
            if (shapes[i] instanceof Circle) {
                System.out.println("Sau khi thay đổi: " + ((Circle) shapes[i]).getArea());
            } else {
                System.out.println("Sau khi thay đổi: " + ((Rectangle) shapes[i]).getArea());

            }
        }
    }
}
