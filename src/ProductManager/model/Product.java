package ProductManager.model;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String categorize;
    private static int idIncrease = 1;

    public Product() {
    }

    public Product(String name, int quantity, double price, String categorize) {
        this.id = idIncrease;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.categorize = categorize;
        idIncrease++;
    }

    public Product(int id, String name, int quantity, double price, String categorize) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.categorize = categorize;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategorize() {
        return categorize;
    }

    public void setCategorize(String categorize) {
        this.categorize = categorize;
    }

    @Override
    public String toString() {
        return id + ". Name= '" + name + '\'' +
                ", quantity= " + quantity +
                ", price= " + price +
                ", categorize= '" + categorize + '\'';
    }
}
