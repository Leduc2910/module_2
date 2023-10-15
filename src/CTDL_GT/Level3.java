package CTDL_GT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Level3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        bai3(1, 10);
//        bai5(5);
//        System.out.println(bai6UCLN(12, 27));
//        bai6BCNN(12, 27);
//        bai8();
//        int[] arr = new int[]{2, 31, 5, 23, 5, 32};
//        bai11(arr);
//        bai12(arr);
//        bai14(arr);
//        bai15(new int[]{8, 4, 8, 5, 4, 9}, new int[]{3, 8, 8, 8, 8, 4, 7});
        bai17(5, new int[]{2, 1, 6, 2, 5, 3});
        bai18(3, new int[]{2, 1, 6, 2, 5, 3});
        System.out.println(bai20(27,12));
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

    public static void bai17(int n, int[] arr) {

        boolean[] sameValue = new boolean[n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i] == j && !sameValue[j - 1]) {
                    sameValue[j - 1] = true;
                    break;
                }
            }
        }
        for (boolean check : sameValue) {
            if (!check) {
                System.out.println("Không chứa từ 1 đến n");
                return;
            }
        }
        System.out.println("Chứa từ 1 đến n");
    }

    public static void bai18(int k, int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int min_value = arr[i];
            int min_index = i;
            while (min_index > 0 && min_value > arr[min_index - 1]) {
                arr[min_index] = arr[min_index - 1];
                min_index--;
            }
            arr[min_index] = min_value;
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        System.out.println(Arrays.toString(result));
    }

    public static int bai20(int a, int b) {
        if (b == 0) return a;
        int temp = b;
        b = a % b;
        a = temp;
        return bai20(a, b);
    }
}
