package view;

import entities.House;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static House getHouseInfo() {
        House house = new House();
        System.out.println("Enter house owner's name");
        house.setName(sc.nextLine());
        System.out.println("Enter house's number");
        house.setHouseNumber(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter meter ID");
        house.setIdMeter(Integer.parseInt(sc.nextLine()));
        return house;
    }
}
