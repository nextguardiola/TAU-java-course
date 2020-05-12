package chapter10;

public class Fruit {
    protected double calories;

    public Fruit(){

    }

    public Fruit(double calories){
        this.calories = calories;
    }

    public void makeJuice(){
        System.out.println("juice is made");
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
