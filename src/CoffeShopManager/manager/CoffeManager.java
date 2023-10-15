package CoffeShopManager.manager;

import Access_modifier.a.A;
import CoffeShopManager.dao.ReadAndWriteIOFile;
import CoffeShopManager.models.Coffe;

import java.util.ArrayList;

public class CoffeManager implements IManager<Coffe> {
    ReadAndWriteIOFile readAndWriteIOFile;
    private ArrayList<Coffe> coffes;

    public CoffeManager() {
        readAndWriteIOFile = new ReadAndWriteIOFile();
        coffes = readAndWriteIOFile.readFile();
    }

    public int findIndex(String name) {
        for (int i = 0; i < coffes.size(); i++) {
            if (coffes.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean add(Coffe coffe) {
        coffes.add(coffe);
        readAndWriteIOFile.writeFile(coffes);
        return true;
    }

    @Override
    public boolean edit(String name, Coffe coffe) {
        int index = findIndex(name);
        coffes.set(index, coffe);
        readAndWriteIOFile.writeFile(coffes);
        return true;
    }

    @Override
    public boolean delete(String name) {
        int index = findIndex(name);
        coffes.remove(index);
        readAndWriteIOFile.writeFile(coffes);
        return true;
    }

    public boolean searchByName(String name) {
        int index = findIndex(name);
        System.out.println(coffes.get(index));
        return true;
    }

    public ArrayList<Coffe> sortASC() {
        ArrayList<Coffe> list = coffes;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j).getPrice() > list.get(j + 1).getPrice()) {
                    Coffe coffee = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, coffee);
                }
            }
        }
        return list;
    }
    @Override
    public ArrayList<Coffe> findAll() {
        return coffes;
    }
}
