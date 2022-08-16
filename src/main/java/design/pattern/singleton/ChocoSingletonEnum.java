package design.pattern.singleton;



public class ChocoSingletonEnum {
    public static void main(String[] args) {
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
        singleton.fill();

        singleton.boil();
        singleton.drain();

    }
}
enum Singleton{
    UNIQUE_INSTANCE;
    private boolean empty;
    private boolean boiled;

    private Singleton() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("fill the boiler with a milk/chocolate mixture");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("empty the boiler!!");
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            Println("bring content to boil");
            boiled = true;
        }
    }

    public void Println(Object text) {
        System.out.println(text);
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}