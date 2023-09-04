package Java_Overview;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//                                              BIẾN
        int a;
        // System.out.println(a); lỗi
        a = 30;
        // <=> int a = 30;
        System.out.println(a);
        // muốn sử dụng biến trong Java thì biến phải được khai báo và có giá trị
        int b = 10, c = 20, d = 30;
        // Tên biến bắt đầu bằng chữ cái hoặc $ hoặc _

//                                              Các kiểu dữ liệu trong Java
        /*
        * Số : int, double, float
        * Chuỗi : String
        * Ký tự : char
        * boolean : boolean
        */
        int number1 = 1;
        double number2 = 5.999;
        float number3 = 5.999f; // cần f ở cuối
        String string1 = "Đức" + "C06" + 29;
        char char1 = 'c';
        boolean boolean1 = true;

//                                              Các loại toán tử
        /*
        * Toán tử số học : +  -  * /  ++ --
        * Toán tử gán : += -= *= /= %= =
        * Toán tử so sánh : == != < > <= >=
        * Toán tử logic : && || ! & |
        */
        System.out.println(false & true);

//                                              Nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập num = ");
//        int num = sc.nextInt();
        String str = sc.nextLine();
//        System.out.println(num);
        System.out.println(str);
        String str2 = new Scanner(System.in).nextLine();
        System.out.println(str2);

//                                              Lý thuyết

    }
}
