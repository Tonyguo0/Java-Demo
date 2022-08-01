package design.pattern.strategy;

public class NoFly implements FlyBehaviour{
    @Override
    public void Fly() {
        System.out.println("not flying at all lol");
    }
}
