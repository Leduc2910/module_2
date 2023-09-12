package Access_modifier.b;

import Access_modifier.a.A;

public class B extends A {
    public B(String name, int age) {
        super(name, age);
    }

    /*Public: cho phép truy cập thuộc tính và phương thức ở bất cứ đâu trong chương trình
     * Default: cho phép truy cập thuộc tính và phương thức của lớp đó ở trong cùng 1 package
     * Private: cho phép truy cập thuộc tính và phương thức ở trong cùng 1 lớp
     * Protected: cho phép truy cập thuộc tính và phương thức của lớp đó khi trong cùng 1 package
     *            ngoài package thì phải nằm trong mối quan hệ kế thừa */
    public void go2() {
        System.out.println(name);
    }
/*    public static void main(String[] args) {
        A a = new A("Đức", 20;
        System.out.println(a.name);
        System.out.println(a.age); // lỗi do access_modifier là default, do khác package
        a.go();
    }*/
}
