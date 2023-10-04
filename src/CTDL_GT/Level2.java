package CTDL_GT;

public class Level2 {
    public static void main(String[] args) {
        bai5(5);
        bai6_1(55);
        bai6_2(10);
        bai8(7, 3);
        bai9();
        bai10(2, 2, 3);
        int[] arr = {10, -2, 1, -4, 5, 9, 10};
        int[] arr2 = {10, -2, 1, -4, 5, 2, 9, 10,20,21,21,23};
        bai11(arr);
        bai12(arr);
        bai13(arr);
        bai14(arr);
        bai15(arr, arr2);
    }

    public static void bai5(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += (2 * i + 1) / (2 * i + 2);
        }
        System.out.println("Bai 5: " + sum);
    }

    public static void bai6_1(int a) {
        System.out.print("6.1. Ước nguyên lẻ lớn nhất của " + a + ": ");
        int max = 1;
        for (int i = 1; i < a; i++) {
            if (a % i == 0 && i % 2 != 0) {
                max = i;
            }
        }
        System.out.println(max);
    }

    public static void bai6_2(int a) {
        System.out.print("6.1. Bội chẵn nhỏ  nhất của " + a + ": ");
        int min = a;
        for (int i = a + 1; ; i++) {
            if (i % a == 0 && i % 2 == 0) {
                min = i;
                break;
            }
        }
        System.out.println(min);
    }

    public static void bai8(int nam, int nu) {
        System.out.print("8. Số cặp nam - nu: ");
        if (nam > nu) {
            System.out.println(nu);
        } else {
            System.out.println(nam);
        }
        System.out.println("Số cặp đồng giới: " + Math.abs(nam - nu) / 2);
    }

    public static void bai9() {
        int total = 20000;
        int[] arrayMoney = {5000, 2000, 1000};
        int[] quantity = new int[arrayMoney.length];
        for (int i = 0; i < arrayMoney.length; i++) {
            quantity[i] = total / arrayMoney[i];
            total %= arrayMoney[i];
        }
        for (int i = 0; i < arrayMoney.length; i++) {
            System.out.println(arrayMoney[i] + " đồng x " + quantity[i]);
        }
    }

    public static void bai10(int a, int b, int c) {
        System.out.println("10. ");
        for (int i = 100; i <= 999; i++) {
            int digit1 = i / 100;
            int digit2 = (i % 100) / 10;
            int digit3 = i % 10;

            if ((digit1 == a || digit1 == b || digit1 == c)
                    && (digit2 == a || digit2 == b || digit2 == c)
                    && (digit3 == a || digit3 == b || digit3 == c)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void bai11(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void bai12(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void bai13(int[] arr) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max2 = max;
                max = arr[i];
            }
            if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];
            }

        }
        System.out.print(max + " ");
        System.out.println(max2);
    }

    public static void bai14(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %3 == 0) {
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void bai15(int[] arr1, int[] arr2) {
        boolean check = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] != arr2[j]) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("Tất cả mảng A không thuộc mảng B");
                return;
            }
        }
        System.out.println("Tất cả mảng A thuộc mảng B");

    }
}
