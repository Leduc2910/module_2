package Class_object;

public class Runable {
    public static void main(String[] args) {
//                                      Car
        Car c = new Car("Mercedes", 300, "đỏ");
        c.go();
        System.out.println(c.toString());
//                                      Rectangle
        Rectangle hcn = new Rectangle(5, 4);
        System.out.println(hcn.toString());
        hcn.setLength(10);
        hcn.setWidth(5);
        System.out.println("Diện tích HCN = " + hcn.getArea());
        System.out.println("Chu vi HCN = " + hcn.getPerimeter());
//                                      Student
        double[] mark = {9.4, 7.3, 8.0};
        Student s1 = new Student("Lộc", 19, mark);
        double[] mark2 = {6.0, 8.9, 3.5};
        Student s2 = new Student("Đức", 20, mark2);
        s1.compareAvg(s1, s2);
//                                      Stop watch
        Stop_watch clock = new Stop_watch();
        clock.start();
        System.out.println(clock.getStartTime());
        try {
            Thread.sleep(200); // Đợi 200 millisecond
        } catch (InterruptedException e) {
            // Xử lý ngoại lệ nếu có
            e.printStackTrace();
        }

        clock.stop();
        System.out.println(clock.getEndTime());
        System.out.println(clock.getElapsedTime());
//                                      Fan
        Fan f1 = new Fan();
        f1.setSpeed(f1.FAST);
        f1.setRadius(10);
        f1.setColor("Yellow");
        f1.setOn(true);
        Fan f2 = new Fan();
        f2.setSpeed(f2.MEDIUM);
        System.out.println(f1.toString());
        System.out.println(f2.toString());

    }
}
