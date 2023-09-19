package Abstract.Interface;

import Access_modifier.a.A;

public interface FLyable {
    static final double PI = 3.14; // mặc định thuộc tính là stactic final

    String fly(); // mặc định các phương thức là public abstract
}

interface Animal {
    void eat();

    String fly();
}

class Bird implements FLyable, Animal {


    @Override
    public String fly() {
        return "Chim đang bay";
    }

    @Override
    public void eat() {

    }
}

class Main2 {
    public static void main(String[] args) {
//        FLyable flyable = new FLyable();
        // không thể khởi tạo đối tượng từ interface
        Bird bird = new Bird();
        System.out.println(bird.fly());
    }
}
