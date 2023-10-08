package IOfile.Manager;

import IOfile.Model.Product;

import java.util.ArrayList;

public class ProductManager implements IManager<Product> {
    private ReadAndWriteProductList readAndWrite;
    private ArrayList<Product> list;

    public ProductManager() {
        readAndWrite = new ReadAndWriteProductList();
        list = readAndWrite.readFile();
    }

    public int findIndex(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void add(Product product) {
        this.list.add(product);
        readAndWrite.writeList(this.list);
    }

    public void edit(int index, Product product) {
        this.list.set(index, product);
        readAndWrite.writeList(this.list);
    }


    public void delete(int index) {
        this.list.remove(index);
        readAndWrite.writeList(this.list);
    }

    public ArrayList<Product> findAll() {
        return this.list;
    }


}
