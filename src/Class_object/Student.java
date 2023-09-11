package Class_object;

import java.util.Arrays;

public class Student {
    public String name;
    public int age;
    public double[] mark;

    public Student() {
    }

    public Student(String name, int age, double[] mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMark(double[] mark) {
        this.mark = mark;
    }

    public String showAll() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + Arrays.toString(mark) +
                '}';
    }

    public double getAvg() {
        double sum = 0;
        for (int i = 0; i < this.mark.length; i++) {
            sum += this.mark[i];
        }
        return sum / this.mark.length;
    }

    public void compareAvg(Student s1, Student s2) {
        if (s1.getAvg() > s2.getAvg()) {
            System.out.println(s1.showAll());
        } else if (s1.getAvg() == s2.getAvg()) {
            System.out.println("Điểm trung bình bằng nhau");
        } else {
            System.out.println(s2.showAll());
        }
    }
}
