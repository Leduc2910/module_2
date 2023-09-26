package People_manager;

import java.util.Scanner;

public class Menu {
    private MenuPeople menuPeople = new MenuPeople();
    private Town listHouseHold = new Town();
    private Scanner num = new Scanner(System.in);
    private Scanner str = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("-----Quản lý khu phố-----\n" +
                    "1. Thêm hộ dân\n" +
                    "2. Sửa thông tin một hộ dân\n" +
                    "3. Xóa thông tin một hộ dân\n" +
                    "4. Hiển thị danh sách hộ dân\n" +
                    "5. Quản lý hộ dân\n" +
                    "0. Thoát chương trình\n" +
                    "-------------------------\n");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = num.nextInt();
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
                    showMenuPeople();
                    break;
                default:
                    System.out.println("Thoát chương trình!!!");
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuAdd() {
        System.out.print("Nhập số nhà: ");
        int houseNumber = num.nextInt();
        HouseHold listPeople = new HouseHold(houseNumber);
        System.out.print("Nhập số thành viên trong gia đình : ");
        int countPeople = num.nextInt();
        for (int i = 0; i < countPeople; i++) {
            System.out.println("Người thứ " + (i + 1) + ":");
            System.out.print("Nhập tên: ");
            String name = str.nextLine();
            System.out.print("Nhập tuổi: ");
            int age = num.nextInt();
            System.out.print("Nhập nghề nghiệp: ");
            String job = str.nextLine();
            System.out.print("Nhập số căn cước: ");
            int identity = num.nextInt();
            People people = new People(name, age, job, identity);
            listPeople.add(people);
        }
        listHouseHold.add(listPeople);
        System.out.println("Thêm thành công!!!\n");
    }

    public void showMenuDelete() {
        System.out.print("Nhập số nhà của hộ dân: ");
        int houseNumber = num.nextInt();
        if (listHouseHold.findIndex(houseNumber) == -1) {
            System.out.println("Không có thông tin hộ dân này!!!\n");
            return;
        }
        listHouseHold.delete(houseNumber);
        System.out.println("Xóa thành công!!!\n");
    }

    public void showMenuEdit() {
        System.out.print("Nhập số nhà: ");
        int houseNumber = num.nextInt();
        if (listHouseHold.findIndex(houseNumber) == -1) {
            System.out.println("Không có thông tin hộ dân này!!!\n");
            return;
        }
        HouseHold listPeople = new HouseHold(houseNumber);
        System.out.print("Nhập số thành viên trong gia đình : ");
        int countPeople = num.nextInt();
        for (int i = 0; i < countPeople; i++) {
            System.out.println("Người thứ " + (i + 1) + ":");
            System.out.print("Nhập tên: ");
            String name = str.nextLine();
            System.out.print("Nhập tuổi: ");
            int age = num.nextInt();
            System.out.print("Nhập nghề nghiệp: ");
            String job = str.nextLine();
            System.out.print("Nhập số căn cước: ");
            int identity = num.nextInt();
            People people = new People((i + 1), name, age, job, identity);
            listPeople.add(people);
        }
        listHouseHold.edit(houseNumber, listPeople);
        System.out.println("Sửa thành công!!!\n");
    }
    public void showMenuPeople() {
        System.out.print("Nhập số nhà: ");
        int houseNumber = num.nextInt();
        if (listHouseHold.findIndex(houseNumber) == -1) {
            System.out.println("Không có thông tin hộ dân này!!!\n");
            return;
        }
        menuPeople.showMainMenu(houseNumber, listHouseHold);
    }

    public void showAll() {
        System.out.println("Danh sách các hộ dân trong khu phố: ");
        listHouseHold.showAll();
    }
}
