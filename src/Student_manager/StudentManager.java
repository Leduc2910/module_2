package Student_manager;

import java.util.ArrayList;

public class StudentManager {

    private Student[] listStudent = new Student[1];
    private static int size = 0;

    public static int getSize() {
        return size;
    }

    public int findId(int id) {
        for (int i = 0; i < size; i++) {
            if (id == this.listStudent[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    public void add(Student student) {
        if (size < this.listStudent.length) {
            this.listStudent[size] = student;
            size++;
        } else {
            Student[] listStudent2 = new Student[size + 1];
            for (int i = 0; i < size; i++) {
                listStudent2[i] = this.listStudent[i];
            }
            listStudent2[size] = student;
            this.listStudent = listStudent2;
            size++;
        }
    }

    public void edit(int index, Student student) {
        student.setId(this.listStudent[index].getId());
        this.listStudent[index] = student;
    }

    public void delete(int index) {
        for (int i = index; i < size - 1; i++) {
            this.listStudent[i] = this.listStudent[i + 1];
        }
        size--;
    }

    public double getMaxAvg() {
        double maxAvg = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            if (maxAvg < this.listStudent[i].getAverage()) {
                maxAvg = this.listStudent[i].getAverage();
            }
        }
        return maxAvg;
    }

    public void getAllMaxAvg() {
        double maxAvg = getMaxAvg();
        if (size == 0) {
            System.out.println("Chưa có sinh viên nào!!!\n");
        } else {
            for (int i = 0; i < size; i++) {
                if (this.listStudent[i].getAverage() == maxAvg) {
                    System.out.println(this.listStudent[i].toString());
                }
            }
            System.out.println();
        }
    }

    public Student getStudentById(int id) {
        for (int i = 0; i < size; i++) {
            if (id == this.listStudent[i].getId()) {
                return this.listStudent[i];
            }
        }
        return null;
    }

    public ArrayList<Student> getStudentByName(String name) {
        ArrayList<Student> listStudent2 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (this.listStudent[i].getName().toLowerCase().contains(name.toLowerCase())) {
                listStudent2.add(this.listStudent[i]);
            }
        }
        return listStudent2;
    }


    public void show() {
        if (size == 0) {
            System.out.println("Chưa có sinh viên nào!!!\n");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(listStudent[i].toString());
            }
            System.out.println();
        }
    }
}
