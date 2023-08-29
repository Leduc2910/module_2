package Java_Overview;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
//                                          Nhập xuất
/*        System.out.println("Hello World");
        System.out.println("Hello world, Hi Ae");
        String name = str.nextLine();
        System.out.println("Hello "+name);
        int a = 5;
        System.out.println(a);
        int b = num.nextInt();
        System.out.println(b);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);
        String name1 = str.nextLine();
        int age = num.nextInt();
        System.out.println("Xin chào "+name1+", tôi năm nay "+age);*/

//                                          Toán tử
/*        double a = num.nextDouble();
        double b = num.nextDouble();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);*/

//                                          Điều kiện
        // bai 1:
        int a = num.nextInt();
        int b = num.nextInt();
        if (a%b == 0) {
            System.out.println("chia het");
        } else {
            System.out.println("khong chia het");
        }
        // bai 2:
        int age = num.nextInt();
        if (age < 15) {
            System.out.println("khong du dieu kien");
        } else {
            System.out.println("du dieu kien");
        }
        // bai 3:
        int c = num.nextInt();
        if (c < 0) {
            System.out.println(c+" nho hon 0");
        } else if(c > 0) {
            System.out.println(c+" lon hon 0");
        } else {
            System.out.println("c = 0");
        }
        // bai 4:
        if (a < b) {
            if (b < c) {
                System.out.println("max = "+c);
            } else {
                System.out.println("max = "+b);
            }
        } else {
            if (a < c) {
                System.out.println("max = "+c);
            } else {
                System.out.println("max = "+a);
            }
        }
        // bai 1:
        double tempoC = num.nextDouble();
        double tempoF = tempoC*9/5 + 32;
        System.out.println(tempoF);
        // bai 2:
        double met = num.nextDouble();
        double ft = met * 3.2808;
        System.out.println(ft);
        // bai 3:
        System.out.println("Dien tich HV = "+(a*a));
        // bai 4:
        System.out.println("Dien tich HCN = "+(a*b));
        // bai 5:
        System.out.println("Dien tich TGV = "+(a*b)/2);
        // bai 6:
        if (a == 0) {
            if (b==0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Co nghiem = "+(-b/a));
        }
        // bai 7:
        double delta, x1, x2, x;
        String result;
        delta = b * b - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    result = "Phuong trình vô số nghiệm";
                } else {
                    result = "Phương trình vô nghiệm";
                }
            } else {
                result = "Phương trình bậc nhất x = " + (-c / b);
            }
        } else {
            if (delta < 0) {
                result = "Phương trình vô nghiệm";
            } else if (delta == 0) {
                x = -b / (2 * a);
                result = "Phương trình có nghiệm duy nhất    x1 = x2 = " + x;
            } else {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                result = "Phương trình có 2 nghiệm phân biệt \nx1 = " + x1 + "\nx2 = " + x2;
            }
        }
        System.out.println(result);

        // bai 9
        if (a + b > c || a + c > b || b + c > a) {
            System.out.println("tao thanh 1 tam giac");
        } else {
            System.out.println("khong tao thanh 1 tam giac");
        }
    }
}
