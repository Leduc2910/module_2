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
        int[] arr = new int[]{2, 31, 5, 23, 5, 32};
        bai11(arr);
        bai12(arr);
        bai14(arr);
        bai15(new int[]{8, 4, 8, 5, 4, 9}, new int[]{3, 8, 8, 8, 8, 4, 7});
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

    public static void bai11(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                System.out.println(arr[i + 1]);
            }
        }
    }

    public static void bai12(int[] arr) {
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            }
            if (arr[i] % 2 != 0) {
                sumOdd += arr[i];
            }
        }
        if (sumEven > sumOdd) {
            System.out.println("Tong phan tu chan lon hon tong phan tu le");
        } else if (sumEven < sumOdd) {
            System.out.println("Tong phan tu le lon hon tong phan tu chan");
        } else {
            System.out.println("Tong pt le va chan = nhau");
        }
    }

    public static void bai14(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum / arr.length);
    }

    public static void bai15(int[] arr, int[] arr2) {
        boolean[] used = new boolean[arr2.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (!used[j] && arr[i] == arr2[j]) {
                    count++;
                    used[j] = true;
                    break;
                }
            }
        }
        System.out.println("So cap = " + count);
    }
    
}
