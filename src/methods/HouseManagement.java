package methods;

import entities.House;

import java.util.ArrayList;

public class HouseManagement {
    ArrayList<House> houses = new ArrayList<>();

    public void show() {
        for (House house:houses) {
            System.out.println(house.toString());
        }
    }

    public void add (House house) {
        houses.add(house);
    }
    public House getByNumber(int number) {
        House h = null;
        for (House house:houses) {
            if (house.getHouseNumber() == number) h = house;
        }
        return h;
    }
    public boolean update (House updateHouse) {
        boolean found = false;
        for (House house:houses) {
            if (house.getHouseNumber() == updateHouse.getHouseNumber()) {
                house.setIdMeter(updateHouse.getIdMeter());
                house.setName(updateHouse.getName());
                found = true;
            }
        }
        return found;
    }
    public House remove (int number) {
        for (House house:houses) {
            if (house.getHouseNumber() == number) {
                houses.remove(house);
                return house;
            }
        }
        return null;
    }
}
