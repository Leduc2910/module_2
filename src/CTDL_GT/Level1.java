package CTDL_GT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Level1 {
    public static Scanner num = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    public static void main(String[] args) {
        isOddOrEven(5);
        bai2(22);
        bai3(1, 11);
        bai4(2, 5);
        bai5(10);
        bai6_1(50);
        bai6_2(50);
        bai7(9);
        bai8(2, 1);
        bai9();
        bai10(1, 2, 3);
        int[] arr = {2, 3, 4, 51, 34, 51};
        bai11(arr);
        bai12(arr);
        bai13(arr);
        bai14(arr);
        bai15(arr);
        bai16(arr);
    }

    public static void isOddOrEven(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }

    public static void bai2(int n) {
        if (n >= 1 && n <= 9) {
            System.out.println("2. Cần rán 1 lần");
        }
        if (n > 9) {
            int i = n / 9;
            if (n - 9 * i == 0) {
                System.out.println("2. Cần rán " + i + " lần");
            }
            if (n - 9 * i >= 1 && n - 9 * i <= 9) {
                System.out.println("2. Cần rán " + (i + 1) + " lần");
            }
        }
    }

    public static void bai3(int num1, int num2) {
        System.out.println("3. Danh sách các số lẻ từ " + num1 + " đến " + num2 + ": ");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void bai4(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i < num2; i++) {
            sum += i;
        }
        System.out.println("4. Tổng các số từ " + num1 + " đến " + num2 + " = " + sum);
    }

    public static void bai5(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * (i + 1);
        }
        System.out.println("5. S = " + sum);
    }

    public static void bai6_1(int a) {
        System.out.println("6.1.Các ước số nguyên dương của " + a);
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void bai6_2(int a) {
        System.out.println("6.1.Các bội số nguyên dương nhỏ hơn 100 của " + a);
        for (int i = a; i <= 100; i++) {
            if (i % a == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void bai7(int a) {
        System.out.print("7. Cách đọc của " + a + ": ");
        switch (a) {
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("Chín");
                break;
        }
    }

    public static void bai8(int n, int s) {
        System.out.print("8. ");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    if (i + j + k == s) {
                        System.out.println("X = " + i + "; Y = " + j + "; Z = " + k);
                    }
                }
            }
        }
    }

    public static void bai9() {
        System.out.print("9. ");
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 10; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i + 2 * j + 5 * k == 20) {
                        System.out.println("X = " + i + "; Y = " + j + "; Z = " + k);
                    }
                }
            }
        }
    }

    public static void bai10(int a, int b, int c) {
        System.out.println("10. ");
        for (int i = 100; i <= 999; i++) {
            int digit1 = i / 100;
            int digit2 = (i % 100) / 10;
            int digit3 = i % 10;

            if (digit1 != digit2 && digit1 != digit3 && digit2 != digit3
                    && (digit1 == a || digit2 == a || digit3 == a)
                    && (digit1 == b || digit2 == b || digit3 == b)
                    && (digit1 == c || digit2 == c || digit3 == c)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void bai11(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void bai12(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void bai13(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void bai14(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void bai15(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Mang khong tang dan");
                return;
            }
        }
        System.out.println("Mang tang dan");
    }

    public static void bai16(int[] arr) {
        Map<Integer, Integer> countNum = new HashMap<>();
        for (int num : arr) {
            if (countNum.containsKey(num)) {
                countNum.put(num, countNum.get(num) + 1);
            } else {
                countNum.put(num, 1);
            }
        }
        for (Integer num :
                countNum.keySet()) {
            System.out.println("Phần tử " + num + " xuất hiện " + countNum.get(num) + " lần");
        }
    }

    public static void bai17(int[] arr1, int[] arr2) {
        boolean[] used = new boolean[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[i] && arr1[i])
            }
        }
    }
}
