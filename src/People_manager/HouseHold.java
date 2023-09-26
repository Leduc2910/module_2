package People_manager;

import java.util.ArrayList;

public class HouseHold {
    private int countPeople;
    private int houseNumber;

    private ArrayList<People> listPeople = new ArrayList<>();

    public ArrayList<People> getListPeople() {
        return listPeople;
    }

    public void setListPeople(ArrayList<People> listPeople) {
        this.listPeople = listPeople;
    }

    public HouseHold(int houseNumber) {
        this.countPeople = 0;
        this.houseNumber = houseNumber;
        People.setIdIncrease(1);
    }

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void add(People people) {
        this.listPeople.add(people);
        this.countPeople = this.listPeople.size();
    }

    public int findIndex(int id) {
        for (int i = 0; i < listPeople.size(); i++) {
            if (listPeople.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void delete(int id) {
        int index = findIndex(id);
        listPeople.remove(index);
        this.countPeople = listPeople.size();
    }

    public void edit(int id, People people) {
        int index = findIndex(id);
        listPeople.set(index, people);
    }


    public void showAll() {
        System.out.println("Nhà số " + houseNumber + " có " + countPeople + " thành viên:");
        for (People people :
                listPeople) {
            System.out.println(people);
        }
    }
}
