package IOfile.View;

import IOfile.Manager.ProductManager;
import IOfile.Model.Product;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private Scanner inputNum = new Scanner(System.in);
    private Scanner inputStr = new Scanner(System.in);
    private ProductManager list = new ProductManager();

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
                        showAll();
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
                    case 0:
                        System.out.println("Thoát thành công!!!");
                        break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Sai định dạng nhập lại!!!\n");
                choice = -1;
            }
        } while (choice != 0);
    }

    public void showMenuAdd() {
        System.out.println("\nĐang thêm mới sản phẩm....");
        System.out.print("Nhập tên sản phẩm: ");
        String name = inputStr.nextLine();
        int quantity;
        while (true) {
            System.out.print("Nhập số lượng sản phẩm: ");
            try {
                quantity = Integer.parseInt(inputNum.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Sai định dạng nhập lại!!!");
            }

        }
        double price;
        while (true) {
            System.out.print("Nhập giá sản phẩm: ");
            try {
                price = Double.parseDouble(inputNum.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Sai định dạng nhập lại!!!");
            }

        }
        System.out.print("Nhập loại sản phẩm: ");
        String categorize = inputStr.nextLine();
        Product product = new Product(name, quantity, price, categorize);
        list.add(product);
        System.out.println("Thêm thành công!!!\n");
    }

    public void showMenuEdit() {
        System.out.println("\nĐang sửa sản phẩm....");
        int id;
        while (true) {
            try {
                System.out.print("Nhập id sản phẩm cần sửa: ");
                id = Integer.parseInt(inputNum.nextLine());
                break;
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        }
        int index = list.findIndex(id);
        if (index == -1) {
            System.out.println("Không có sản phẩm nào có id này!!!\n");
            return;
        }
        System.out.print("Nhập tên sản phẩm: ");
        String name = inputStr.nextLine();
        int quantity;
        while (true) {
            System.out.print("Nhập số lượng sản phẩm: ");
            try {
                quantity = Integer.parseInt(inputNum.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Sai định dạng nhập lại!!!");
            }

        }
        double price;
        while (true) {
            System.out.print("Nhập giá sản phẩm: ");
            try {
                price = Double.parseDouble(inputNum.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Sai định dạng nhập lại!!!");
            }

        }
        System.out.print("Nhập loại sản phẩm: ");
        String categorize = inputStr.nextLine();
        Product product = new Product(id, name, quantity, price, categorize);
        list.edit(index, product);
        System.out.println("Sửa thành công!!!\n");
    }

    public void showMenuDelete() {
        System.out.println("\nĐang xóa sản phẩm....");
        int id;
        while (true) {
            try {
                System.out.print("Nhập id sản phẩm cần xóa: ");
                id = Integer.parseInt(inputNum.nextLine());
                break;
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        }
        int index = list.findIndex(id);
        if (index == -1) {
            System.out.println("Không có sản phẩm nào có id này!!!\n");
            return;
        }
        list.delete(index);
        System.out.println("Xóa thành công!!!\n");
    }

    public void showAll() {
        for (Product product : list.findAll()) {
            System.out.println(product);
        }
        System.out.println();
    }

    public void searchByName() {
        System.out.println("\nTìm kiếm theo tên gần đúng...");
        System.out.print("Nhập tên gần đúng: ");
        String name = inputStr.nextLine();
        for (Product product :
                list.findAll()) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(product);
            }
        }
        System.out.println();
    }

    public void searchCategorize() {
        System.out.println("\nTìm kiếm theo loại sản phẩm...");
        System.out.print("Nhập loại sản phẩm cần tìm: ");
        String categorize = inputStr.nextLine();
        for (Product product :
                list.findAll()) {
            if (product.getCategorize().toLowerCase().contains(categorize.toLowerCase())) {
                System.out.println(product);
            }
        }
        System.out.println();
    }

    public void searchById() {
        System.out.println("\nTìm kiếm theo id sản phẩm...");
        int id;
        while (true) {
            try {
                System.out.print("Nhập id sản phẩm cần sửa: ");
                id = Integer.parseInt(inputNum.nextLine());
                break;
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        }
        int index = list.findIndex(id);
        if (index == -1) {
            System.out.println("Không có sản phẩm nào có id này!!!\n");
        } else {
            System.out.println(list.findAll().get(index));
        }
        System.out.println();
    }
}
