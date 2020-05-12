package chapter6;

public class PhoneBill {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBill(){
        id = 0;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id,double baseCost, int allottedMinutes, int minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes(){
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed(){
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed){
        this.minutesUsed = minutesUsed;
    }

    //Calculate overage
    public double calculateOverageFee(){
        if(minutesUsed < allottedMinutes){
            return 0;
        }
        else{
            double overageRate = 0.25;
            double overageFee = (minutesUsed - allottedMinutes) * overageRate;
            overageFee = Math.round(overageFee * 100.0) / 100.0;
            return overageFee;
        }
    }

    //Calculate tax
    public double calculateTax(){
        double taxPercentage = .15;
        double tax = (baseCost + calculateOverageFee()) * taxPercentage;
        tax = Math.round(tax * 100.0) / 100.0;
        return tax;
    }

    //Calculate total amount
    public void calculateTotal(){
        double total = baseCost + calculateOverageFee() + calculateTax();

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + baseCost);
        System.out.println("Overage: $" + calculateOverageFee());
        System.out.println("Tax: $" + calculateTax());
        System.out.println("Total: $" + total);
    }

}
