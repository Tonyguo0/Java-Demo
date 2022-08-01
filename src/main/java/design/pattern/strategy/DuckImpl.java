package design.pattern.strategy;

public class DuckImpl {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.Display();
        mallard.doFly();
        mallard.doQuack();
//        mallard.changeFlyMode(new NoFly());
//        mallard.changeQuackMode(new Squeak());
//        mallard.doFly();
//        mallard.doQuack();
        Duck rubber = new RubberDuck();
        rubber.Display();
        rubber.doFly();
        rubber.doQuack();
        rubber.changeFlyMode(new FlyRocketPowered());
        rubber.doFly();

    }
}
