package Java_Overview;

import java.util.Scanner;

public class James_1 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        // Hiển thị lời chào
//        System.out.print("Enter your name: ");
//        String name = str.nextLine();
//        System.out.println("Hello "+name);
        // Chuyển đổi tiền tệ từ USD -> VND
//        int rate = 23000;
//        System.out.println("Enter USD: ");
//        double usd = num.nextDouble();
//        System.out.println("VND = " + (usd * rate));
        // Đọc số thành chữ
        int num1;
        String result = "";
        do {
            System.out.println("Nhập vào một số nguyên (0-999): ");
            num1 = num.nextInt();
        } while (num1 < 0 || num1 > 999);
        if (num1 < 10) {
            switch (num1) {
                case 0:
                    result = "Zero";
                    break;
                case 1:
                    result = "One";
                    break;
                case 2:
                    result = "Two";
                    break;
                case 3:
                    result = "Three";
                    break;
                case 4:
                    result = "Four";
                    break;
                case 5:
                    result = "Five";
                    break;
                case 6:
                    result = "Six";
                    break;
                case 7:
                    result = "Seven";
                    break;
                case 8:
                    result = "Eight";
                    break;
                case 9:
                    result = "Nine";
                    break;
            }
        } else if (num1 < 20) {
            switch (num1) {
                case 10:
                    result = "Ten";
                    break;
                case 11:
                    result = "Eleven";
                    break;
                case 12:
                    result = "Twelve";
                    break;
                case 13:
                    result = "Thirteen";
                    break;
                case 14:
                    result = "Fourteen";
                    break;
                case 15:
                    result = "Fifteen";
                    break;
                case 16:
                    result = "Sixteen";
                    break;
                case 17:
                    result = "Seventeen";
                    break;
                case 18:
                    result = "Eighteen";
                    break;
                case 19:
                    result = "Nineteen";
                    break;
            }
        } else if (num1 < 100) {
            String dv;
            switch (num1 % 10) {
                case 1:
                    dv = "One";
                    break;
                case 2:
                    dv = "Two";
                    break;
                case 3:
                    dv = "Three";
                    break;
                case 4:
                    dv = "Four";
                    break;
                case 5:
                    dv = "Five";
                    break;
                case 6:
                    dv = "Six";
                    break;
                case 7:
                    dv = "Seven";
                    break;
                case 8:
                    dv = "Eight";
                    break;
                case 9:
                    dv = "Nine";
                    break;
                default:
                    dv = "";
                    break;
            }
            switch (num1 / 10) {
                case 2:
                    result = "Twenty";
                    break;
                case 3:
                    result = "Thirty";
                    break;
                case 4:
                    result = "Forty";
                    break;
                case 5:
                    result = "Fifty";
                    break;
                case 6:
                    result = "Sixty";
                    break;
                case 7:
                    result = "Seventy";
                    break;
                case 8:
                    result = "Eighty";
                    break;
                case 9:
                    result = "Ninety";
                    break;
                default:
                    result = "";
                    break;
            }
            result += " " + dv;
        } else if (num1 < 1000) {
            String dv, hc;
            switch (num1 % 10) {
                case 1:
                    dv = "One";
                    break;
                case 2:
                    dv = "Two";
                    break;
                case 3:
                    dv = "Three";
                    break;
                case 4:
                    dv = "Four";
                    break;
                case 5:
                    dv = "Five";
                    break;
                case 6:
                    dv = "Six";
                    break;
                case 7:
                    dv = "Seven";
                    break;
                case 8:
                    dv = "Eight";
                    break;
                case 9:
                    dv = "Nine";
                    break;
                default:
                    dv = "";
                    break;
            }
            switch ((num1 / 10) % 10) {
                case 2:
                    hc = "Twenty";
                    break;
                case 3:
                    hc = "Thirty";
                    break;
                case 4:
                    hc = "Forty";
                    break;
                case 5:
                    hc = "Fifty";
                    break;
                case 6:
                    hc = "Sixty";
                    break;
                case 7:
                    hc = "Seventy";
                    break;
                case 8:
                    hc = "Eighty";
                    break;
                case 9:
                    hc = "Ninety";
                    break;
                default:
                    hc = "";
                    break;
            }
            switch (num1 / 100) {
                case 1:
                    result = "One";
                    break;
                case 2:
                    result = "Two";
                    break;
                case 3:
                    result = "Three";
                    break;
                case 4:
                    result = "Four";
                    break;
                case 5:
                    result = "Five";
                    break;
                case 6:
                    result = "Six";
                    break;
                case 7:
                    result = "Seven";
                    break;
                case 8:
                    result = "Eight";
                    break;
                case 9:
                    result = "Nine";
                    break;
                default:
                    result = "";
                    break;
            }
            String re = (num1 % 100 != 0) ? "and " + hc + " " + dv : "";
            result = result + " hundred " + re;
        }
        System.out.println(result);
    }
}
