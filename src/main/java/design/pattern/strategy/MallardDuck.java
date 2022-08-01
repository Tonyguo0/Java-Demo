package design.pattern.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flybehaviour = new FlyWithWings();
        quackbehaviour = new Quack();
    }

    public void Display() {
        System.out.println("Hi I'm Mallard Duck Sheeesh");
    }


}
