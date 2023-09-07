package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class James {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
//                                      Reverse Array
/*        int size;
        do {
            System.out.print("Enter size of array: ");
            size = num.nextInt();
            if (size < 0) {
                System.out.println("Enter size > 0!");
            }
        } while (size < 0);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Array[" + i + "]: ");
            arr[i] = num.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("After reverse array: "+Arrays.toString(arr));*/

//                                      Search Student
/*        String[] list_student = {"Đức", "Dân", "Đề", "Mai", "Tiến Anh", "Hiếu", "Lộc", "Lâm"};
        System.out.print("Enter name need search: ");
        String name = str.nextLine();
        boolean hasStudent = false;
        for (int i = 0; i < list_student.length; i++) {
            if (list_student[i].toLowerCase().equals(name.toLowerCase())) {
                hasStudent = true;
                System.out.println("Position of "+name+" is "+i);
            }
        }
        if (!hasStudent) {
            System.out.println("NOT FOUND!!!");
        }*/

//                                      Convert Temperature
/*        while (true) {
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit program");
            System.out.print("Enter your choice: ");
            int choice = new Scanner(System.in).nextInt();
            if (choice == 1) {
                System.out.print("\nEnter fahrenheit: ");
                double f = new Scanner(System.in).nextDouble();
                System.out.println("Celsius: " + exFtoC(f));
                System.out.println();
            } else if (choice == 2) {
                System.out.print("\nEnter celsius: ");
                double c = new Scanner(System.in).nextDouble();
                System.out.println("Celsius: " + exCtoF(c));
                System.out.println();
            } else if (choice == 0) {
                System.out.println("\nExit program!!!\n");
                break;
            } else {
                System.out.println("\nNot valid!!!\n");
            }
        }*/

//                                      Menu array
/*        int size = 0;
        int length;
        int[] arr;
        do {
            System.out.print("Nhập số lượng phần tử: ");
            length = num.nextInt();
            if (length < 0) {
                System.out.println("Số lượng phần tử lớn hơn 0");
            }
        } while (length < 0);
        arr = new int[length];
        while (true) {
            System.out.println("----------------------------------");
            System.out.println("1. Thêm phần tử vào cuối");
            System.out.println("2. Tìm vị trí phần tử trong mảng");
            System.out.println("3. Xóa phần tử tại vị trí bất kỳ");
            System.out.println("4. Thêm phần tử vị trí bất kỳ");
            System.out.println("5. Hiển thị mảng");
            System.out.println("0. Kết thúc chương trình");
            System.out.println("----------------------------------");
            System.out.print("\nEnter your choice: ");
            int choice = num.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập giá trị muốn thêm: ");
                    int element = num.nextInt();
                    arr = push(arr, element, size);
                    size++;
                    System.out.println("Thêm thành công!!!");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Nhập giá trị cần tìm: ");
                    int element_search = num.nextInt();
                    System.out.println("Vị trí của giá trị cần tìm: " + search(arr, element_search, size));
                    System.out.println();
                    break;
                case 3:
                    int del_index;
                    do {
                        System.out.print("Nhập vị trí bạn muốn xóa: ");
                        del_index = num.nextInt();
                        if (del_index < 0 || del_index >= size) {
                            System.out.println("Không hợp lệ!!!");
                        }
                    } while (del_index < 0 || del_index >= size);
                    size = delete(arr, del_index, size);
                    System.out.println("Xóa thành công!!!");
                    System.out.println();
                    break;
                case 4:
                    int insert_index;
                    do {
                        System.out.print("Nhập vị trí muốn thêm: ");
                        insert_index = num.nextInt();
                        if (insert_index < 0) {
                            System.out.println("Không hợp lệ!!!");
                        }
                    } while (insert_index < 0);
                    System.out.print("Nhập giá trị muốn thêm: ");
                    int insert_element = num.nextInt();
                    arr = insert(arr, insert_element, insert_index, size);
                    size++;
                    System.out.println("Thêm thành công!!!");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Mảng hiện tại: " + Arrays.toString(arr));
                    System.out.println();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không hợp lệ!!!");
                    System.out.println();
                    break;
            }
            System.out.println(size);
        }*/

//                                  Gộp mảng
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + " của mảng 1: ");
            arr1[i] = num.nextInt();
        }
        int[] arr2 = new int[6];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + " của mảng 2: ");
            arr2[i] = num.nextInt();
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr2.length + arr1.length; i++) {
            arr3[i] = arr2[i - arr1.length];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] push(int[] arr, int element, int size) {
        if (size < arr.length) {
            arr[size] = element;
        } else {
            int[] arr2 = new int[size + 1];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            arr2[size] = element;
            arr = arr2;
        }
        return arr;
    }


    public static int search(int[] arr, int element, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int delete(int[] arr, int index, int size) {
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0;
        size--;
        return size;
    }

    public static int[] insert(int[] arr, int element, int index, int size) {
        if (size < arr.length) {
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = element;
        } else {
            int[] arr2 = new int[size + 1];
            for (int i = 0; i < index; i++) {
                arr2[i] = arr[i];
            }
            for (int i = size; i > index; i--) {
                arr2[i] = arr[i - 1];
            }
            arr2[index] = element;
            arr = arr2;
        }
        return arr;
    }

    public static double exFtoC(double f) {
        double c = (f - 32) * (5.0 / 9);
        return c;
    }

    public static double exCtoF(double c) {
        double f = c * 9.0 / 5 + 32;
        return f;
    }

    public static void reverse(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
}
