package chapter14;


import java.util.Random;

/**
 * Class for defining Coin
 */

public class Coin {
    final String HEADS = "Heads";
    final String TAILS = "Tails";
    protected String side;

    //Default constructor
    public Coin(){

    }

    //Getter and setter methods of Side field
    public String  getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }


    //Method for flipping coin
    public String flip(){
        side = new Random().nextBoolean() ? HEADS : TAILS;
        return side;
    }
}
