package People_manager;

import java.util.ArrayList;

public class Town {
    private ArrayList<HouseHold> listHouseHold = new ArrayList<>();

    public void add(HouseHold houseHold) {
        listHouseHold.add(houseHold);
    }

    public ArrayList<HouseHold> getListHouseHold() {
        return listHouseHold;
    }

    public void setListHouseHold(ArrayList<HouseHold> listHouseHold) {
        this.listHouseHold = listHouseHold;
    }

    public void delete(int houseNumber) {
        int index = findIndex(houseNumber);
        listHouseHold.remove(index);

    }

    public void edit(int houseNumber, HouseHold houseHold) {
        int index = findIndex(houseNumber);
        listHouseHold.set(index, houseHold);
    }

    public int findIndex(int houseNumber) {
        for (int i = 0; i < listHouseHold.size(); i++) {
            if (listHouseHold.get(i).getHouseNumber() == houseNumber) {
                return i;
            }
        }
        return -1;
    }

    public void showAll() {
        for (HouseHold houseHold : listHouseHold
        ) {
            houseHold.showAll();

        }
        System.out.println();
    }
}
