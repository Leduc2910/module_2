package Class_object;

public class Clazz_obj {
    public String name;
    public int count;
    public Clazz_obj() {
        name = "C06";
        count = 8;
    }
    public String sayHello() {
        return "Hello World";
    }

    public static void main(String[] args) {
        Clazz_obj cls = new Clazz_obj();
        System.out.println(cls.name);
        cls.name = "Duc";
        System.out.println(cls.name);
        System.out.println(cls.sayHello());
    }
}
