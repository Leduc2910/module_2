package Map_Tree;

import java.util.HashMap;
import java.util.Map;

class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class StudentManager {
    Map<Integer, Student> listStudent = new HashMap<>();

    public void add(Student student) {
        listStudent.put(student.getId(), student);
    }

    public void delete(int id) {
        listStudent.remove(id);
    }


    public void show() {
        for (Integer key :
                listStudent.keySet()) {
            System.out.println(listStudent.get(key));
        }
    }
}

class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Linh", 45);
        Student student2 = new Student(2, "Dân", 5);
        Student student3 = new Student(3, "Đề", 4);
        StudentManager listStudent = new StudentManager();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.show();
        listStudent.delete(3);
    }
}

public class Demo {
//    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Dân");
//        map.put(655, "Linh");
//        map.put(1, "Hieu");
//        map.remove(1);
//        System.out.println(map.get(655));
//        System.out.println(map.keySet());
//        for (Integer key : map.keySet()
//        ) {
//            System.out.println(map.get(key));
//        }
//    }
}
