package Student_manager;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private double[] markArray = new double[3];
    private String gender;
    private static int idIncrease = 1;

    public Student() {
    }

    public Student(String name, double math, double literature, double english, String gender) {
        this.id = idIncrease;
        this.name = name;
        this.markArray[0] = math;
        this.markArray[1] = literature;
        this.markArray[2] = english;
        this.gender = gender;
        idIncrease++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getMarkArray() {
        return markArray;
    }

    public void setMarkArray(double[] markArray) {
        this.markArray = markArray;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAverage() {
        double sumMark = 0;
        for (int i = 0; i < this.markArray.length; i++) {
            sumMark += this.markArray[i];
        }
        double averageMark = sumMark / this.markArray.length;
        return averageMark;
    }

    @Override
    public String toString() {
        return this.id +
                ". Tên: " + this.name +
                ", giới tính: " + this.gender +
                ", điểm trung bình: " + this.getAverage();
    }
}
