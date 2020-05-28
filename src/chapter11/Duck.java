package chapter11;

public class Duck extends Animal{

    public Duck(){
    }

    @Override
    public void makeSound(){
        System.out.println("The duck goes quack!");
    }

/*    @Override
    public void eat(){
        //System.out.println("The pig eats pig food");
    }*/
}
