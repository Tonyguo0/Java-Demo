package design.pattern.strategy;

public abstract class Duck {
    FlyBehaviour flybehaviour;
    QuackBehaviour quackbehaviour;
    public Duck(){

    }

    public void doQuack(){
        quackbehaviour.Quack();
    }

    public void doFly(){
        flybehaviour.Fly();
    }

    public void changeFlyMode(FlyBehaviour f){
        flybehaviour = f;
    }

    public void changeQuackMode(QuackBehaviour q){
        quackbehaviour = q;
    }


    public abstract void Display();
}
