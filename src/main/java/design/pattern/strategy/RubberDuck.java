package design.pattern.strategy;

public class RubberDuck extends Duck{
    public RubberDuck(){
        flybehaviour = new NoFly();
        quackbehaviour = new Squeak();
    }

    public void Display(){
        System.out.println("Hi I'm Rubber Duck");
    }

}
