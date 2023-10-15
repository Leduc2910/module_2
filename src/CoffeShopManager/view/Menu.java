package CoffeShopManager.view;

import CoffeShopManager.input.Input;
import CoffeShopManager.manager.CoffeManager;
import CoffeShopManager.models.Coffe;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private CoffeManager list = new CoffeManager();
    private Scanner input = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        String categorize;
        while (true) {
            System.out.println("===== Quản lý cửa hàng coffe =====\n" +
                    "1.\tHiện danh sách món ăn\n" +
                    "2.\tThêm món ăn theo mã\n" +
                    "3.\tSửa món ăn theo mã\n" +
                    "4.\tXóa món ăn theo mã\n" +
                    "5.\tNhập vào tên món, tìm món ăn theo tên.\n" +
                    "6.\tHiện danh sách món ăn theo loại\n" +
                    "7.\tSắp xếp món ăn theo giá tăng dần.\n" +
                    "8.\tXóa món ăn theo loại\n" +
                    "0.\tThoát chương trình\n");
            System.out.print("Nhập lựa chọn của bạn: ");
            try {
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        showAllList();
                        break;
                    case 2:
                        categorize = showCategorizeMenu();
                        showMenuAdd(categorize);
                        break;
                    case 3:
                        showMenuEdit();
                        break;
                    case 4:
                        showMenuDelete();
                        break;
                    case 5:
                        showMenuSearchByName();
                        break;
                    case 6:
                        categorize = showCategorizeMenu();
                        showListByCategorize(categorize);
                        break;
                    case 7:
                        showMenuSort();
                        break;
                    case 8:
                        categorize = showCategorizeMenu();
                        showMenuDeleteByCategorize(categorize);
                        break;
                    case 0:
                        System.out.println("Thoát chương trình thành công!!!");
                        break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Vui lòng nhập số");
            }
        }

    }

    private void showMenuDeleteByCategorize(String categorize) {
        for (int i = 0; i < list.findAll().size(); i++) {
            if (list.findAll().get(i).getCategorize().equals(categorize)) {
                list.findAll().remove(i);
            }
        }
        System.out.println("Xóa thành công!!!\n");
    }

    private void showMenuSort() {
        System.out.println("Danh sách các món sau khi sắp xếp:");
        for (Coffe coffee :
                list.sortASC()) {
            System.out.println(coffee);
        }
        System.out.println();
    }

    private void showListByCategorize(String categorize) {
        boolean isHas = false;
        System.out.println("Danh sách các món có loại là " + categorize + " :");
        for (Coffe coffee :
                list.findAll()) {
            if (coffee.getCategorize().equals(categorize)) {
                System.out.println(coffee);
                isHas = true;
            }
        }
        if (!isHas) {
            System.out.println("Không có món nào!!!\n");
            return;
        }
        System.out.println();
    }

    private void showMenuAdd(String categorize) {
        System.out.println("Đang thêm món mới có mã " + categorize + " ...");
        System.out.print("Nhập tên món: ");
        String name = Input.inputStr();
        System.out.print("Nhập giá: ");
        double price = Input.inputDouble();
        System.out.print("Nhập mô tả: ");
        String description = Input.inputStr();
        System.out.print("Nhập số lượng: ");
        int quantity = Input.inputInteger();
        Coffe coffee = new Coffe(name, price, categorize, description, quantity);
        list.add(coffee);
        System.out.println("Thêm mới thành công!!!\n");
    }

    public void showMenuEdit() {
        System.out.println("Đang sửa món ăn....");
        System.out.print("Nhập tên món cần sửa: ");
        String name = Input.inputStr();
        int index = list.findIndex(name);
        if (index == -1) {
            System.out.println("Không có món này!!!\n");
            return;
        }
        System.out.print("Nhập giá: ");
        Double price = Input.inputDouble();
        System.out.print("Nhập loại món: ");
        String categorize = Input.inputStr();
        System.out.print("Nhập mô tả: ");
        String description = Input.inputStr();
        System.out.print("Nhập số lượng: ");
        int quantity = Input.inputInteger();
        Coffe coffee = new Coffe(name, price, categorize, description, quantity);
        list.edit(name, coffee);
        System.out.println("Sửa thành công!!!\n");
    }

    public void showMenuDelete() {
        System.out.println("Đang xóa món ăn....");
        System.out.print("Nhập tên món cần xóa: ");
        String name = Input.inputStr();
        int index = list.findIndex(name);
        if (index == -1) {
            System.out.println("Không có món này!!!\n");
            return;
        }
        list.delete(name);
        System.out.println("Xóa thành công!!!\n");
    }

    public void showMenuSearchByName() {
        System.out.print("Nhập tên món cần tìm: ");
        String name = Input.inputStr();
        if (list.findIndex(name) == -1) {
            System.out.println("Không có món nào!!!\n");
        }
        list.searchByName(name);
        System.out.println();
    }

    public String showCategorizeMenu() {
        int choice;
        while (true) {
            System.out.println("===== Danh sách mã sản phẩm =====\n" +
                    "1.\tCoffee\n" +
                    "2.\tTrà\n" +
                    "3.\tNước ép\n" +
                    "4.\tBánh\n" +
                    "5.\tĐồ ăn vặt\n" +
                    "0.\tQuay lại\n");
            System.out.print("Nhập lựa chọn của bạn: ");
            try {
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        return "coffee";
                    case 2:
                        return "trà";
                    case 3:
                        return "nước ép";
                    case 4:
                        return "bánh";
                    case 5:
                        return "đồ ăn vặt";
                    case 0:
                        showMainMenu();
                        break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Vui lòng nhập số");
            }
        }
    }

    public void showAllList() {
        System.out.println("Danh sách các món trong cửa hàng: ");
        for (Coffe coffee : list.findAll()) {
            System.out.println(coffee);
        }
        System.out.println();
    }
}
