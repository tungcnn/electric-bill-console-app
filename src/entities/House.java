package entities;

public class House {
    private String name;
    private int houseNumber;
    private int idMeter;

    public House() {
    }

    public House(String name, int houseNumber, int idMeter) {
        this.name = name;
        this.houseNumber = houseNumber;
        this.idMeter = idMeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getIdMeter() {
        return idMeter;
    }

    public void setIdMeter(int idMeter) {
        this.idMeter = idMeter;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", houseNumber=" + houseNumber +
                ", idMeter=" + idMeter +
                '}';
    }
}
