package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String args[]){
        //Initialize values that we know
        double oneDollar = 1;
        double onePenny = 0.01;
        double oneNickle = 0.05;
        double oneDime = 0.1;
        double oneQuarter = 0.25;

        //Get values that we don't know
        //Ask for quantity of pennies
        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int numberOfPennies = scanner.nextInt();

        //Ask for quantity of nickles
        System.out.println("How many nickles would you like?");
        int numberOfNickles = scanner.nextInt();

        //Ask for quantity of dimes
        System.out.println("How many dimes would you like?");
        int numberOfDimes = scanner.nextInt();

        //Ask for quantity of quarters
        System.out.println("How many quarters would you like?");
        int numberOfQuarters = scanner.nextInt();

        scanner.close();

        //Calculate total amount of money
        double total = numberOfPennies * onePenny + numberOfNickles * oneNickle + numberOfDimes * oneDime +
                numberOfQuarters * oneQuarter;

        //Print results
        if(total < oneDollar){
            double amountShort = oneDollar - total;

            System.out.println("You need $" + String.format("%.2f",amountShort) + " more to reach 1 dollar.");
        }
        else if (total > oneDollar){
            double amountExcess = total - oneDollar;

            System.out.println("You need to reduce $" + String.format("%.2f",amountExcess) + " to reach 1 dollar.");
        }
        else {
            System.out.println("Congratulations! You have reached $" + total + " and have won the game!");
        }

        /*if(total < oneDollar){
            double amountShort = oneDollar - total;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");
        }
        else if(total > oneDollar){
            double amountOver = total - oneDollar;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");
        }
        else{
            System.out.println("Yay! That's exactly $1.00! You win!");
        }*/

    }
}
