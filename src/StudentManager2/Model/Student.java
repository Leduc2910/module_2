package StudentManager2.Model;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private String clazz;
    private static int idIncrease = 1;

    public Student() {

    }

    public Student(String name, int age, String address, String clazz) {
        this.id = idIncrease;
        this.name = name;
        this.age = age;
        this.address = address;
        this.clazz = clazz;
        idIncrease++;
    }

    public Student(int id, String name, int age, String address, String clazz) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.clazz = clazz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }
}
