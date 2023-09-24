package StudentManager2.Manager;

import StudentManager2.Model.Student;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> listStudent = new ArrayList<>();

    public StudentManager() {
        add(new Student("Duc", 20, "Ha Noi", "C06"));
        add(new Student("Loc", 19, "Da Nang", "C06"));
        add(new Student("Mai", 23, "Da Nang", "C06"));
        add(new Student("De", 20, "Ha Noi", "C06"));
    }

    public int findIndex(int id) {
        int index;
        for (int i = 0; i < this.listStudent.size(); i++) {
            if (this.listStudent.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void add(Student student) {
        this.listStudent.add(student);
    }

    public void edit(int id, Student student) {
        int index = findIndex(id);
        if (index != -1) {
            this.listStudent.set(index, student);
            System.out.println("Thông tin đã được cập nhật!!!");
        } else {
            System.out.println("Không tìm thấy sinh viên có ID: " + id);
        }

    }

    public void delete(int id) {
        for (Student student :
                listStudent) {
            if (student.getId() == id) {
                listStudent.remove(student);
                System.out.println("Xóa thành công!!!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có ID: " + id);
    }

    public void showAll() {
        for (Student student :
                listStudent) {
            System.out.println(student.toString());
        }
    }

    public boolean isAge(Student student, int age) {
        if (student.getAge() == age) {
            return true;
        }
        return false;
    }

    public boolean isAddress(Student student, String address) {
        if (student.getAddress().toLowerCase().contains(address.toLowerCase())) {
            return true;
        }
        return false;
    }

    public void showAge() {
        for (Student student : listStudent) {
            if (isAge(student, 20)) {
                System.out.println(student.toString());
            }
        }
    }

    public void showAge_Address() {
        for (Student student : listStudent) {
            if (isAge(student, 20) && isAddress(student, "Da Nang")) {
                System.out.println(student.toString());
            }
        }
    }
}
