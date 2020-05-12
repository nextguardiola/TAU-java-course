package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]){
        //Get the student's grade
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        //Determine the message
        String message;

        switch (grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder.";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade.";
                break;
        }

        //Print out the message
        System.out.println(message);
    }
}
