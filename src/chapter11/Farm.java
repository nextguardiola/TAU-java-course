package chapter11;

/**
 * Test Pig and Duck Animal abstract class implementations
 */
public class Farm {
    public static void main(String[] args) {
        Pig pig = new Pig();
        Duck duck = new Duck();

        pig.makeSound();
        pig.eat();

        duck.makeSound();
        duck.eat();
    }
}
