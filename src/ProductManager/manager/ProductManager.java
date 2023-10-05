package ProductManager.manager;

import ProductManager.model.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProductManager implements IManager<Product> {
    private ArrayList<Product> listProduct = new ArrayList<>();

    public int findById(int id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == listProduct.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(Product e) {
        listProduct.add(e);
    }

    @Override
    public void delete(int id) {
        int index = findById(id);
        listProduct.remove(index);
    }

    @Override
    public void edit(int id, Product product) {
        int index = findById(id);
        listProduct.set(index, product);
    }

    @Override
    public ArrayList<Product> showAll() {
        return listProduct;
    }
}
