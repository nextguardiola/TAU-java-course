package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String args[]){

        //Ask for the current season of the year
        System.out.println("Please input the name of the current season of the year.");
        Scanner scanner = new Scanner(System.in);
        String seasonName = scanner.next();

        //Ask for number of coffees user drinks in a day during that season
        System.out.println("Please input the minimum number of cups of coffee you drink in a day of the current season.");
        int numberCoffeeCupsDrink = scanner.nextInt();

        //Ask for adjective
        System.out.println("Please input an adjective to describe this season of the year.");
        String adjective = scanner.next();
        scanner.close();

        //Print out the sentence
        System.out.println("On a " + adjective + " " + seasonName + " day, I drink a minimum of " + numberCoffeeCupsDrink + " cups of coffee.");
    }

}
