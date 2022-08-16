package design.pattern.singleton;

import static org.apache.logging.log4j.ThreadContext.isEmpty;

public class ChocolateSingleton {
    private boolean empty;
    private boolean boiled;
    private static ChocolateSingleton chocosingle;

    private ChocolateSingleton() {
        empty = true;
        boiled = false;
    }
//syncrhonized keyword very expensive can reduce performance by a factor of 100
    public static synchronized ChocolateSingleton getInstance() {
        if (chocosingle == null) {
            chocosingle = new ChocolateSingleton();

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
