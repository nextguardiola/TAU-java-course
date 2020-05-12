package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        printDay(days);
    }

    public static void printDay(String[] array){
        System.out.println("Input a number between 1-7:");
        int dayIndex = scanner.nextInt();
        System.out.println(array[(dayIndex-1)]);
    }
}

