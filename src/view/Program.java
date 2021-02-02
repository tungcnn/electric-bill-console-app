package view;

import entities.Bill;
import entities.House;
import methods.BillManagement;
import methods.HouseManagement;

import java.util.Scanner;

public class Program {
    static Scanner sc = new Scanner(System.in);
    static HouseManagement hm = new HouseManagement();
    static BillManagement bm = new BillManagement();

    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("""
                    /*------------------------------*/
                    1 - House management
                    2 - Bill management
                    3 - Quit""");
            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        houseMenu();
                        break;
                    case 2:
                        billMenu();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Enter a number from 1 to 3");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        } while (choice != 3);
    }

    public static void billMenu() {
        int choice;
        do {
            System.out.println("""
                    /*------------------------------*/
                    1 - Add a bill
                    2 - Display bills information
                    3 - Calculate fee
                    4 - Back""");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Bill bill = new Bill();
                    System.out.println("Enter house number");
                    int houseNum = Integer.parseInt(sc.nextLine());
                    House house = hm.getByNumber(houseNum);
                    if (house == null) {
                        System.out.println("Cannot find a house with that house number");
                        break;
                    }
                    bill.setHouse(house);
                    System.out.println("Enter old meter number");
                    bill.setOldNumber(Integer.parseInt(sc.nextLine()));
                    System.out.println("Enter new meter number");
                    bill.setNewNumber(Integer.parseInt(sc.nextLine()));
                    bm.add(bill);
                    break;
                case 2:
                    bm.show();
                    break;
                case 3:
                    System.out.println("Enter house number to calculate bill");
                    int houseNum2 = Integer.parseInt(sc.nextLine());
                    Bill bill1 = bm.getByHouseNumber(houseNum2);
                    if (bill1 != null) System.out.println("Amount of money owed: " + bm.calculateFee(bill1));
                    else System.out.println("Cannot find that bill");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enter a number from 1 to 4");
                    break;
            }
        } while (choice != 4);
    }

    public static void houseMenu() {
        int choice;
        do {
            System.out.println("""
                    /*------------------------------*/
                    1 - Add a house
                    2 - Display houses information
                    3 - Update house
                    4 - Remove house
                    5 - Back""");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    House house = Menu.getHouseInfo();
                    hm.add(house);
                    break;
                case 2:
                    hm.show();
                    break;
                case 3:
                    boolean success = hm.update(Menu.getHouseInfo());
                    if (success) System.out.println("Done");
                    else System.out.println("Cannot find a house with that house number");
                    break;
                case 4:
                    System.out.println("Enter house number to remove");
                    int houseNum = Integer.parseInt(sc.nextLine());
                    House house1 = hm.remove(houseNum);
                    if (house1 != null) System.out.println("Removed");
                    else System.out.println("Cannot find a house with that house number");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Enter a number from 1 to 5");
                    break;
            }
        } while (choice != 5);
    }
}
