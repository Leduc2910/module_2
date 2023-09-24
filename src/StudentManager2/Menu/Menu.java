package StudentManager2.Menu;

import StudentManager2.Manager.StudentManager;
import StudentManager2.Model.Student;

import java.util.Scanner;

public class Menu {
    private StudentManager listStudent = new StudentManager();
    private Scanner num = new Scanner(System.in);
    private Scanner str = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("-----Quản lý sinh viên-----\n" +
                    "1. Thêm sinh viên\n" +
                    "2. Sửa sinh viên\n" +
                    "3. Xóa sinh viên\n" +
                    "4. Hiển thị tất cả sinh viên tuổi 20\n" +
                    "5. Hiển thị tất cả sinh viên tuổi 23 và quê ở Đà Nẵng\n" +
                    "6. Hiển thị danh sách sinh viên\n" +
                    "0. Thoát chương trình\n");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = num.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    showMenuEdit();
                    break;
                case 3:
                    showMenuDelete();
                    break;
                case 4:
                    showMenuSearch1();
                    break;
                case 5:
                    showMenuSearch2();
                    break;
                case 6:
                    showListStudent();
                    break;
                case 0:
                    System.out.println("Thoát chương trình!!!");
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuAdd() {
        System.out.println("Thêm sinh viên: ");
        System.out.print("Nhập tên: ");
        String name = str.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = num.nextInt();
        System.out.print("Nhập địa chỉ: ");
        String address = str.nextLine();
        System.out.print("Nhập lớp: ");
        String clazz = str.nextLine();
        Student student = new Student(name, age, address, clazz);
        listStudent.add(student);
        System.out.println("Thêm thành công!!!\n");
    }

    public void showMenuEdit() {
        System.out.println("Sửa sinh viên: ");
        System.out.print("Nhập id cần sửa: ");
        int id = num.nextInt();
        System.out.print("Nhập tên: ");
        String name = str.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = num.nextInt();
        System.out.print("Nhập địa chỉ: ");
        String address = str.nextLine();
        System.out.print("Nhập lớp: ");
        String clazz = str.nextLine();
        Student student = new Student(id, name, age, address, clazz);
        listStudent.edit(id, student);
    }

    public void showListStudent() {
        System.out.println("Danh sách sinh viên hiện tại:");
        listStudent.showAll();
        System.out.println();
    }
    public void showMenuDelete() {
        System.out.print("Nhập id cần xóa: ");
        int id = num.nextInt();
        listStudent.delete(id);
    }
    public void showMenuSearch1() {
        System.out.println("Danh sách sinh viên có tuổi = 20: ");
        listStudent.showAge();
    }
    public void showMenuSearch2() {
        System.out.println("Danh sách sinh viên có tuổi = 23 và ở Đà Nẵng: ");
        listStudent.showAge_Address();
    }

}
