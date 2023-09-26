package People_manager;

import java.util.Scanner;

public class MenuPeople {
    private Scanner num = new Scanner(System.in);
    private Scanner str = new Scanner(System.in);

    public void showMainMenu(int houseNumber, Town listHousehold) {
        int choice;
        do {
            System.out.println("-----Quản lý hộ dân-----\n" +
                    "1. Thêm người dân\n" +
                    "2. Sửa thông tin một người dân\n" +
                    "3. Xóa thông tin một người dân\n" +
                    "4. Hiển thị danh sách người dân\n" +
                    "0. Quản lý khu phố\n" +
                    "------------------------\n");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = num.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd(houseNumber, listHousehold);
                    break;
                case 2:
                    showMenuEdit(houseNumber, listHousehold);
                    break;
                case 3:
                    showMenuDelete(houseNumber, listHousehold);
                    break;
                case 4:
                    showAll(houseNumber, listHousehold);
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuAdd(int houseNumber, Town listHouseHold) {
        for (HouseHold houseHold :
                listHouseHold.getListHouseHold()) {
            if (houseHold.getHouseNumber() == houseNumber) {
                System.out.print("Nhập tên: ");
                String name = str.nextLine();
                System.out.print("Nhập tuổi: ");
                int age = num.nextInt();
                System.out.print("Nhập nghề nghiệp: ");
                String job = str.nextLine();
                System.out.print("Nhập số căn cước: ");
                int identity = num.nextInt();
                People people = new People(name, age, job, identity);
                houseHold.add(people);
                System.out.println("Thêm thành công!!!\n");
                return;
            }
        }
    }

    public void showMenuDelete(int houseNumber, Town listHouseHold) {
        System.out.print("Nhập id cần xóa: ");
        int id = num.nextInt();
        for (HouseHold houseHold :
                listHouseHold.getListHouseHold()) {
            if (houseHold.getHouseNumber() == houseNumber) {
                if (houseHold.findIndex(id) == -1) {
                    System.out.println("Không có người dân này!!!\n");
                    return;
                }
                houseHold.delete(id);
                System.out.println("Xóa thành công!!!\n");
                return;
            }
        }
    }

    public void showMenuEdit(int houseNumber, Town listHouseHold) {
        System.out.print("Nhập id cần sửa: ");
        int id = num.nextInt();
        for (HouseHold houseHold :
                listHouseHold.getListHouseHold()) {
            if (houseHold.getHouseNumber() == houseNumber) {
                if (houseHold.findIndex(id) == -1) {
                    System.out.println("Không có người dân này!!!\n");
                    return;
                }
                System.out.print("Nhập tên: ");
                String name = str.nextLine();
                System.out.print("Nhập tuổi: ");
                int age = num.nextInt();
                System.out.print("Nhập nghề nghiệp: ");
                String job = str.nextLine();
                System.out.print("Nhập số căn cước: ");
                int identity = num.nextInt();
                People people = new People(id, name, age, job, identity);
                houseHold.edit(id, people);
                System.out.println("Sửa thành công!!!\n");
                return;
            }
        }
    }


    public void showAll(int houseNumber, Town listHouseHold) {
        for (HouseHold houseHold :
                listHouseHold.getListHouseHold()) {
            if (houseHold.getHouseNumber() == houseNumber) {
                houseHold.showAll();
                return;
            }
        }
    }
}
