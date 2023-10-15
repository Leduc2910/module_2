package CoffeShopManager.manager;

import java.util.ArrayList;

public interface IManager<T> {
    boolean add(T t);
    boolean edit(String value, T t);
    boolean delete(String value);
    ArrayList<T> findAll();
}
