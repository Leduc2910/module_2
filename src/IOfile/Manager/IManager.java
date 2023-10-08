package IOfile.Manager;

import java.util.ArrayList;

public interface IManager<T> {
    void add(T t);
    void edit(int index, T t);
    void delete(int index);
    ArrayList<T> findAll();
}
