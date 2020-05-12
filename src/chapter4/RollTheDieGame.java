package chapter4;

import java.util.Random;

/**
 * ROLL THE DIE GAME
 * This is a homework from Test Automation University for Chapter 4
 * The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls
 */
public class RollTheDieGame {
    public static void main(String args[]){
        //Initialize the values we know
        int totalRolls = 5;
        int totalSpace = 20;
        int currentSpace = 0;

        //Roll the die
        Random random = new Random();


        for(int i=0; i < totalRolls; i++){
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            if(currentSpace > totalSpace) {
                System.out.println("Roll #" + (i+1) + ": You've rolled a " + die + ". You lost! You have exceeded the maximum space of " + totalSpace);
                break;
                }
            else if(currentSpace < totalSpace && i+1 == totalRolls){
                System.out.println("Roll #" + (i+1) + ": You've rolled a " + die + ". You lost! You are still in space " + currentSpace + " after " + totalRolls + " rolls of die");
            }
            else if(currentSpace == totalSpace && i+1 == totalRolls){
                System.out.println("Roll #" + (i+1) + ": You've rolled a " + die + ". You're on space " + totalSpace + ". Congrats, you win!");
            }
            else {
                System.out.println("Roll #" + (i+1) + ": You've rolled a " + die + ". You are now on space " + currentSpace + " and have " + (totalSpace - currentSpace) + " more to go.");
            }
        }


    }
}
