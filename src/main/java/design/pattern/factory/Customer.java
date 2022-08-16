package design.pattern.factory;

public class Customer {
    public static void main(String[] args) {
        PizzaStore nystore = new NYPizzaStore();
        PizzaStore chicagostore = new ChicagoStylePizzaStore();

        Pizza pizza = nystore.orderPizza("cheese");
        System.out.println("Tony ordered a " + pizza.getName() + "\n");

        Pizza pizza2 = chicagostore.orderPizza("cheese");
        System.out.println("Na ordered a " + pizza2.getName() + "\n");

    }
}
