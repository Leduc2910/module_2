package CTDL_GT;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Level3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        bai3(1, 10);
        bai5(5);
        System.out.println(bai6UCLN(12, 27));
        bai6BCNN(12, 27);
        bai8();
    }

    public static void bai3(int x, int y) {
        for (int i = x; i <= y; i++) {
            for (int j = 0; j < i; j++) {
                if (j * j == i) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void bai5(int n) {
        int sum = 100;
        for (int i = 1; i <= n; i++) {
            sum += (i * (i + 1)) / ((i + 1) * (i + 2));
        }
        System.out.println(sum);
    }

    public static int bai6UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void bai6BCNN(int a, int b) {
        System.out.println(a * b / bai6UCLN(a, b));
    }

    public static void bai8() {
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Nhập N: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập số thành viên: ");
            int num = sc.nextInt();
            array.add(num);
        }
    }
    public static void bai11() {

    }
}
