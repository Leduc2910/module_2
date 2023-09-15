package Da_hinh;

public class Calculator {
    public int add(int a, int b) {
        return a * b;
    }

    public double add(double a, double b) {
        return a * b;
    }

    public int add(int a, int b, int c) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(3, 5));
        System.out.println(cal.add(3.4, 5.0));
        System.out.println(cal.add(3, 5, 6));
    }
}
