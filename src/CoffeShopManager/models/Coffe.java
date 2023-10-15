package CoffeShopManager.models;

import CoffeShopManager.dao.ReadAndWriteIOFile;

public class Coffe {
    private String name;
    private double price;
    private String categorize;
    private String description;
    private int quantity;
    private ReadAndWriteIOFile readAndWriteIOFile = new ReadAndWriteIOFile();

    public Coffe() {
    }

    public Coffe(String name, double price, String categorize, String description, int quantity) {
        this.name = name;
        this.price = price;
        this.categorize = categorize;
        this.description = description;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Tên món = " + name +
                ", giá= " + price +
                ", loại sản phẩm = " + categorize +
                ", mô tả = " + description +
                ", số lượng = " + quantity;
    }
}
