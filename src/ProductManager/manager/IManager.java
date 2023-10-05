package ProductManager.manager;

import java.util.ArrayList;

public interface IManager<T> {
    void add(T e);

    void delete(int id);

    void edit(int id, T t);

    ArrayList<T> showAll();
}
