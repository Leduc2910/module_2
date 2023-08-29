package Loop_Java;

public class Loop {
    public static void main(String[] args) {
        //                                      Vong lap - Loop

        // Vong lap for : dùng để duyệt các phần tử và làm việc với index
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Vong lap for-each : dùng để duyệt các phần tử của một collection như mảng, linkedlist, HashSet,...
        int[] arr = {0, 1, 2, 3, 4, 5};
        // item : các đối tượng trong collection
        // arr : đối tượng cần lặp
        for (int item : arr) {
            System.out.println(item);
        }

        // Vong lap while : thực thi một khối lệnh nếu điều kiện trả về true
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // vong lap do-while : thực thi ít nhập một lần khối lệnh mặc đù điều kiện đúng hay sai
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);

        // break : dùng để kết thúc vòng lặp
        for (int k = 0; k < 5; k++) {
            if (k == 3) {
                break;
            }
            System.out.println(k);
        }

        // continue : dùng để bỏ qua vòng lặp hiện tại
        for (int k = 0; k < 5; k++) {
            if (k == 3) {
                continue;
            }
            System.out.println(k);
        }
    }
}
