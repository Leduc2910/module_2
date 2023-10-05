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
                        showMenuEdit();
                        break;
                    case 3:
                        showMenuDelete();
                        break;
                    case 4:
                        showMenuShow();
                        break;
                    case 5:
                        searchByName();
                        break;
                    case 6:
                        searchCategorize();
                        break;
                    case 7:
                        searchById();
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

    public void showMenuEdit() {
        System.out.print("\nSửa sản phẩm có id: ");
        int id = inputNum.nextInt();
        int index = listProduct.findById(id);
        if (index == -1) {
            System.out.println("Không có sản phẩm trong danh sách!!!\n");
            return;
        }
        System.out.print("Nhập tên sản phẩm: ");
        String name = inputStr.nextLine();
        System.out.print("Nhập số lượng sản phẩm: ");
        int quantity = inputNum.nextInt();
        System.out.print("Nhập giá sản phẩm: ");
        double price = inputNum.nextInt();
        System.out.print("Nhập loại sản phẩm: ");
        String categorize = inputStr.nextLine();
        Product product = new Product(id, name, quantity, price, categorize);
        listProduct.edit(index, product);
        System.out.println("Sửa thành công!!!\n");
    }

    public void showMenuDelete() {
        System.out.print("\nNhập id cần xóa: ");
        int id = inputNum.nextInt();
        int index = listProduct.findById(id);
        if (index == -1) {
            System.out.println("Không có sản phẩm trong danh sách!!!\n");
            return;
        }
        listProduct.delete(id);
        System.out.println("Xóa thành công!!!\n");
    }

    public void searchByName() {
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String name = inputStr.nextLine();
        listProduct.searchByName(name);
        System.out.println();
    }

    public void searchCategorize() {
        System.out.print("Nhập loại sản phẩm cần tìm: ");
        String categorize = inputStr.nextLine();
        listProduct.searchCategorize(categorize);
        System.out.println();
    }

    public void searchById() {
        System.out.print("Nhập id sản phẩm cần tìm: ");
        int id = inputNum.nextInt();
        listProduct.searchById(id);
        System.out.println();
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
