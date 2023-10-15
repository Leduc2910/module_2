package IOfile.input;

import java.util.Scanner;

public class Input {
    private static Scanner input = new Scanner(System.in);

    public static int getInputInt() {
        int number;
        while (true) {
            try {
                number = Integer.parseInt(input.nextLine());
                return number;
            } catch (NumberFormatException exception) {
                System.out.println("Vui lòng nhập số: ");
            }
        }
    }
    public static double getInputDouble() {
        double number;
        while (true) {
            try {
                number = Double.parseDouble(input.nextLine());
                return number;
            } catch (NumberFormatException exception) {
                System.out.println("Vui lòng nhập số: ");
            }
        }
    }

    public static String getInputString() {
        return input.nextLine();
    }

}
