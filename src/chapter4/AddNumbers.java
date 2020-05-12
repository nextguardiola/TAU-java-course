package chapter4;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

/**
 * DO WHILE LOOP
 * Write a program that allows a user to enter two numbers,
 * and then sum up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */

public class AddNumbers {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        boolean again = false;
        do{
            //Input first number
            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            //Input second number
            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            //Print sum
            System.out.println("The sum is "+ sum);

            //Ask the user to go again or not
            System.out.println("Would you like to start over? (True or false)");
            again = scanner.nextBoolean();

        } while (again);
    }
}
