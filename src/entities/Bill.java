package entities;

public class Bill {
    private House house;
    private int oldNumber;
    private int newNumber;
    private int fee;

    public Bill() {
    }

    public Bill(House house, int oldNumber, int newNumber, int fee) {
        this.house = house;
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.fee = fee;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public int getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(int oldNumber) {
        this.oldNumber = oldNumber;
    }

    public int getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }

    public int getFee() {
        fee = (newNumber - oldNumber)*750;
        return fee;
    }

    @Override
    public String toString() {
        return "Bill {" +
                "House = " + house.toString() +
                ", oldNumber =" + oldNumber +
                ", newNumber =" + newNumber +
                ", fee = " + getFee() +
                '}';
    }
}
