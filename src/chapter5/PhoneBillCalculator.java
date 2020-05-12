package chapter5;

import java.util.Scanner;

/**
 * OPTIONAL ASSIGNMENT CHAPTER 5
 * Calculate the final total of someone's cellphone bill
 * Allow the operator to input the plan fee and the number of overage minutes.
 * Charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal.
 * Create separate methods to calculate the tax, overage fees, and final total.
 * Print the itemized bill.
 */

public class PhoneBillCalculator {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String args[]) {
        //Get values for Plan Fee and Overage Minutes
        double planFee = getPlanFee();
        double overageMinutes = getOverageMinutes();

        //Calculate Overage Fee, Tax, and Total
        double overageFee = calculateOverageFee(overageMinutes);
        double tax = calculateTax(planFee, overageFee);

        //Print Itemized Bill
        calculateAndPrintItemizedBill(planFee, overageFee, tax);

    }

    public static double getPlanFee(){
        System.out.println("Enter base cost of the plan:");
        double planFee = scanner.nextDouble();
        return planFee;
    }

    public static double getOverageMinutes(){
        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();
        return overageMinutes;
    }

    public static double calculateOverageFee(double overageMinutes){
        double overageRate = .25;
        double overageFee = overageMinutes * overageRate;
        overageFee = Math.round(overageFee * 100.0) / 100.0;
        return overageFee;
    }

    public static double calculateTax(double planFee, double overageFee){
        double taxPercentage = .15;
        double tax = (planFee + overageFee) * taxPercentage;
        tax = Math.round(tax * 100.0) / 100.0;
        return tax;
    }

    public static void calculateAndPrintItemizedBill(double planFee, double overageFee, double tax){
        double total = planFee + overageFee + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + planFee);
        System.out.println("Overage: $" + overageFee);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}
