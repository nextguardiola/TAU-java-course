package chapter11;

public class Pig extends Animal{

    public Pig(){
    }

    @Override
    public void makeSound(){
        System.out.println("The pig goes oink!");
    }

    @Override
    public void eat(){
        System.out.println("The pig eats pig food");
    }

}
