package chapter14;

import java.util.Scanner;

public class CoinTossGame {

    CoinTossGame game = new CoinTossGame();

    public static void main(String[] args) {
        Player player1 = new Player("Joko");
        Player player2 = new Player("Jaka");

        //Get Player 1 guess & set Player 2's guess
        CoinTossGame.setGuess(player1, player2);

        //Pick the winner
        determineWinner(player1, player2);

    }

    public static void setGuess(Player player1, Player player2){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi " + player1.name + " please enter your guess: ");
        player1.setGuess(scanner.next());
        while(!player1.guess.equals("Heads") && !player1.guess.equals("Tails")){
            System.out.println("Wrong input " + player1.name +", please enter either 'Heads' or 'Tails' :" );
            player1.setGuess(scanner.next());
        }

        if(player1.guess.equals("Heads")){
            player2.setGuess("Tails");
        }else{
            player2.setGuess("Heads");
        }
        scanner.close();
        System.out.println(player1.name + " picked " + player1.guess);
        System.out.println(player2.name + " picked " + player2.guess);
    }

    public static void determineWinner(Player player1, Player player2){
        Coin coin = new Coin();
        String sideFlipped = coin.flip();
        System.out.println("The coin flip result is " + sideFlipped);

        if(player1.guess.equals(sideFlipped)){
            System.out.println("Congratulations " + player1.name + " you won!");
        }else {
            System.out.println("Congratulations " + player2.name + " you won!");
        }
    }
}
