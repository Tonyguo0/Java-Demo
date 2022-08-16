package design.pattern.singleton;


public class ChocolateSingletonDoubleChecking {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateSingletonDoubleChecking chocosingle;

    private ChocolateSingletonDoubleChecking() {
        empty = true;
        boiled = false;
    }

    //check for instance if there isn't one enter synchronized block, only synchronize the first time
    public static ChocolateSingletonDoubleChecking getInstance() {
        if (chocosingle == null) {
            synchronized (ChocolateSingletonDoubleChecking.class) {
                if (chocosingle == null) {
                    chocosingle = new ChocolateSingletonDoubleChecking();

                }

            }
        }
        return chocosingle;
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
            System.out.println("fill the boiler with a milk/chocolate mixture");
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println("bring content to boil");
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
