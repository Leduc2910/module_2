package Package.account; // các gói

// cách truy cập đến gói khác
import Package.food.do_an.Water;
// không thể import 2 class trùng tên trong 2 package khác nhau
//import Package.food.do_uong.Water;

public class ClientPlayer {
    Water noodle = new Water();
    // cách 2 để truy cập đến package khác
//    Package.food.do_uong.Water water = new Package.food.do_uong.Water();
}
