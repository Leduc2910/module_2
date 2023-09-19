package Student_manager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner num = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);

    public static void main(String[] args) {

        //
/*        StudentManager listStudent = new StudentManager();
        listStudent.add(new Student("Duc", 6.0, 7.5, 8.6, "Male"));
        listStudent.add(new Student("De", 7.5, 7.5, 8.6, "Male"));
        listStudent.add(new Student("Loc", 9.9, 10.0, 5.0, "Female"));
        listStudent.show();
        listStudent.edit(1, new Student("Mai", 8.7, 6.7, 5.0, "Female"));
        listStudent.show();
//        listStudent.delete(2);
//        listStudent.show();
        System.out.println(listStudent.getAverageClazz());
//        Student student = listStudent.getStudentById(2);
//        System.out.println(student.toString());
        for (Student student2:
                listStudent.getStudentByName("D")) {
            System.out.println(student2.toString());
        }*/
        StudentManager listStudent = new StudentManager();
        listStudent.add(new Student("Duc", 6.0, 7.5, 8.6, "Nam"));
        listStudent.add(new Student("De", 7.5, 7.5, 8.6, "Nam"));
        listStudent.add(new Student("Loc", 9.9, 10.0, 5.0, "Nu"));
        while (true) {
            System.out.println("                 Quản lý sinh viên");
            System.out.println("---------------------------------------------------");
            System.out.println("1. Thêm mới sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Sửa sinh viên");
            System.out.println("4. Tìm kiếm sinh viên theo ID");
            System.out.println("5. Hiển thị danh sách sinh viên theo tên gần đúng");
            System.out.println("6. Sinh viên có điểm trung bình lớn nhất");
            System.out.println("7. Hiển thị danh sách sinh viên");
            System.out.println("0. Thoát chương trình");
            System.out.println("-------------------------------------------------\n");
            int choice;
            do {
                System.out.print("Nhập lựa chọn của bạn: ");
                choice = new Scanner(System.in).nextInt();
                if (choice < 0 || choice > 7) {
                    System.out.println("Hãy nhập lựa chọn từ 0 đến 7!!!");
                }
            } while (choice < 0 || choice > 7);
            switch (choice) {
                case 1:
                    addStudent(listStudent);
                    break;
                case 2:
                    deleteStudent(listStudent);
                    break;
                case 3:
                    editStudent(listStudent);
                    break;
                case 4:
                    searchById(listStudent);
                    break;
                case 5:
                    searchByName(listStudent);
                    break;
                case 6:
                    listStudent.getAllMaxAvg();
                    break;
                case 7:
                    System.out.println("Danh sách sinh viên là:");
                    listStudent.show();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void addStudent(StudentManager listStudent) {
        System.out.println("Thêm mới sinh viên:");
        System.out.print("Nhập tên: ");
        String name = str.nextLine();
        System.out.print("Nhập điểm toán: ");
        double math = checkMark();
        System.out.print("Nhập điểm văn: ");
        double literature = checkMark();
        System.out.print("Nhập điểm anh: ");
        double english = checkMark();
        System.out.print("Nhập giới tính: ");
        String gender = str.nextLine();
        Student student = new Student(name, math, literature, english, gender);
        listStudent.add(student);
        System.out.println("Thêm mới thành công\n");
    }

    public static double checkMark() {
        double mark;
        do {
            mark = num.nextDouble();
            if (mark < 0 || mark > 10) {
                System.out.println("Nhập điểm từ 0 đến 10!!!");
            }
        } while (mark < 0 || mark > 10);
        return mark;
    }

    public static void deleteStudent(StudentManager listStudent) {
        System.out.print("Nhập id muốn xóa: ");
        int id = num.nextInt();
        int index = listStudent.findId(id);
        if (index != -1) {
            listStudent.delete(index);
            System.out.println("Xóa thành công!!!\n");
        } else {
            System.out.println("Không có sinh viên này!!!\n");
        }

    }

    public static void editStudent(StudentManager listStudent) {
        System.out.print("Nhập id muốn sửa: ");
        int id = num.nextInt();
        int index = listStudent.findId(id);
        if (id == -1) {
            System.out.println("Không có sinh viên này!!!\n");
        } else {
            System.out.print("Nhập tên: ");
            String name = str.nextLine();
            System.out.print("Nhập điểm toán: ");
            double math = checkMark();
            System.out.print("Nhập điểm văn: ");
            double literature = checkMark();
            System.out.print("Nhập điểm anh: ");
            double english = checkMark();
            System.out.print("Nhập giới tính: ");
            String gender = str.nextLine();
            Student student = new Student(name, math, literature, english, gender);
            listStudent.edit(index, student);
            System.out.println("Cập nhật thành công!!!\n");
        }
    }

    public static void searchById(StudentManager listStudent) {
        System.out.print("Nhập id muốn tìm: ");
        int id = num.nextInt();
        Student student = listStudent.getStudentById(id);
        if (student != null) {
            System.out.println(student.toString());
            System.out.println();
        } else {
            System.out.println("Không có sinh viên này!!!\n");
        }
    }

    public static void searchByName(StudentManager listStudent) {
        System.out.print("Nhập tên muốn tìm: ");
        String name = str.nextLine();
        ArrayList<Student> listStudent2;
        listStudent2 = listStudent.getStudentByName(name);
        if (listStudent2.size() != 0) {
            System.out.println("Danh sách sinh viên: ");
            for (Student student :
                    listStudent2) {
                System.out.println(student.toString());
            }
            System.out.println();
        } else {
            System.out.println("Không có sinh viên này!!!\n");
        }
    }
}
