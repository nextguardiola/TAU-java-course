package chapter6;

import chapter5.PhoneBillCalculator;

/**
 * OPTIONAL ASSIGNMENT CHAPTER 6 (chapter 5 optional REDO)
 * Calculate the final total of someone's cellphone bill
 * Allow the operator to input the plan fee and the number of overage minutes.
 * Charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal.
 * Create separate methods to calculate the tax, overage fees, and final total.
 * Print the itemized bill.
 */

public class PhoneBillCalculatorRedo {

    public static void main(String args[]) {
        PhoneBill phoneBill = new PhoneBill(12345678);
        phoneBill.setMinutesUsed(1000);
        phoneBill.calculateTotal();
    }


/*
    public void getPhoneBill(){
        //Get values for Phone Bill
        System.out.println("Enter the id:");
        phoneBill.getId();
        System.out.println("Enter the base cost:");
        phoneBill.getBaseCost();
        System.out.println("Enter the number of allotted minutes:");
        phoneBill.getAllottedMinutes();
        System.out.println("Enter the number of minutes used:");
        phoneBill.getMinutesUsed();
    }

    public void printPhoneBill(){
        phoneBill.calculateTotal();
    }
*/


}
