package Class_object;

public class Car {
    public String name;
    public double weight;
    public String color;

    public Car(String value1, double value2, String value3) {
        this.name = value1;
        this.weight = value2;
        this.color = value3;
    }

    public void go() {
        System.out.println(this.name + " đang di chuyển");
    }

    @Override
    public String toString() {
        return "Đây là xe " + this.name + " màu " + this.color + " và nặng khoảng " + this.weight;
    }
}
