package Access_modifier.a;

public class A {
    protected String name;  // [access_modifier] [tên_kiểu_dữ_liệu] [tên_biến];
    protected int age;
    public static int count; // Sử dụng để khai báo thuộc tính và phương thức của lớp (không phải của đối tượng)

    public A(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public void go() {
        System.out.println(this.name + " dang di");
    }

    public static void go3() {

        System.out.println("Hello");
    }
    static {

    }


/*    public static void main(String[] args) {
        A a = new A("Linh", 20);
        System.out.println(a.name);
        System.out.println(a.age);
        a.go();
    }*/
}

class Main {
    public static void main(String[] args) {
        A a1 = new A("Đức", 20);
        A a2 = new A("Đề", 20);
        System.out.println(A.count); // có thể truy xuất thành phần static
        A.go3();// bằng lớp hoặc đối tượng (không cần khởi tạo đối tượng vẫn có thể sử dụng được)
    }
}