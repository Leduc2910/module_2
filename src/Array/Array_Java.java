package Array;

public class Array_Java {
    public static void main(String[] args) {
//                                      Tham trị và tham chiếu
        // Kiểu tham trị (thường là biến nguyên thủy)
        int a = 1; // Khi khởi tạo a ==> cấp một ô nhớ  ==> lưu 1 vào ô nhớ
        int b = a; // Khi khởi tạo b ==> cấp một ô nhớ  ==> sao chép giá trị từ ô nhớ (a) sang ô nhớ (b)
        String mess = "Hello";
        // Bộ nhớ stack : lưu trữ biến cục bộ (biến nguyên thủy, biến tham chiếu, hoặc các đối số được truyền vào hàm), lời gọi hàm,..

        // Kiểu tham chiếu (thường là Object, Array)
/*        let l = {
                name:"Linh";
        }
        let l1 = l;
        console.log(l=== l1) // true vi` cung` trỏ vào một địa chỉ */

//                                      Mảng
        /*Mảng là một biến tham chiếu đến một loạt các giá trị liên tiếp nhau
        * Các giá trị được lưu trữ trong mảng có cùng kiểu dữ liệu*/
        // Khai báo mảng
        int[] songuyen = {1,2,3,4};
        String[] chuoi = {"Hello","Hi"};
        // Khi khao báo các biến kiểu dữ liệu NGUYÊN THỦY thì chúng được cấp bộ nhớ tương ứng để lưu trữ dữ liệu (tham trị)
        // Khi khai báo biến MẢNG thì sẽ cấp phát bộ nhớ tham chiếu đến mảng (tham chiếu)

//                                      Phương thức
        /*Là một nhóm các câu lệnh thực hiện một nhiệm vụ nhất định
        * Cú pháp:
        modifier Kieu_tra_ve Ten_phuong_thuc (danh_sach_tham_so) {
            //code
            return gia_tri;
        }
        */
        System.out.println(cal(5,5));
    }
    public static int cal(int num1, int num2) {
        return num1+num2;
    }
}
