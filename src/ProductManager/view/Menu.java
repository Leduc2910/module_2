package ProductManager.view;

import ProductManager.manager.ProductManager;
import ProductManager.model.Product;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private ProductManager listProduct = new ProductManager();
    private Scanner inputNum = new Scanner(System.in);
    private Scanner inputStr = new Scanner(System.in);

    public void showMainMenu() {

        int choice;
        do {
            System.out.println("-----Quản lý sản phẩm----- \n" +
                    "1. Thêm mới sản phẩm\n" +
                    "2. Sửa sản phẩm theo id\n" +
                    "3. Xóa sản phẩm theo id\n" +
                    "4. Lấy ra tất cả sản phẩm\n" +
                    "5. Tìm kiếm các sản phẩm theo tên gần đúng\n" +
                    "6. Nhập vào loại sản phẩm và lấy ra tất cả sản phẩm cùng loại\n" +
                    "7. Tìm sản phẩm theo id\n" +
                    "0. Thoát chương trình\n" +
                    "-------------------------\n");
            System.out.print("Nhập lựa chọn của bạn: ");
            try {
                choice = Integer.parseInt(inputStr.nextLine());
                switch (choice) {
                    case 1:
                        showMenuAdd();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        showMenuShow();
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Thoát thành công!!!");
                        break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Sai định dạng nhập lại!!!");
                choice = -1;
            }
        } while (choice != 0);
    }

    public void showMenuAdd() {
        System.out.println("\nThêm sản phẩm mới:");
        System.out.print("Nhập tên sản phẩm: ");
        String name = inputStr.nextLine();
        System.out.print("Nhập số lượng sản phẩm: ");
        int quantity = inputNum.nextInt();
        System.out.print("Nhập giá sản phẩm: ");
        double price = inputNum.nextInt();
        System.out.print("Nhập loại sản phẩm: ");
        String categorize = inputStr.nextLine();
        Product product = new Product(name, quantity, price, categorize);
        listProduct.add(product);
        System.out.println("Thêm thành công!!!\n");
    }

    public void showMenuShow() {
        System.out.println("Danh sách sản phẩm hiện tại: ");
        ArrayList<Product> list = listProduct.showAll();
        for (Product product :
                list) {
            System.out.println(product);
        }
        System.out.println();
    }
}
