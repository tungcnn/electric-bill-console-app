package methods;

import entities.Bill;

import java.util.ArrayList;

public class BillManagement {
    ArrayList<Bill> bills = new ArrayList<>();
    public void add(Bill bill) {
        bills.add(bill);
    }
    public void show() {
        for (Bill bill:bills) {
            System.out.println(bill.toString());
        }
    }
    public Bill getByHouseNumber(int number) {
        for (Bill bill:bills) {
            if (bill.getHouse().getHouseNumber() == number)
                return bill;
        }
        return null;
    }
    public int calculateFee (Bill bill) {
        return (bill.getNewNumber() - bill.getOldNumber())*750;
    }
}
