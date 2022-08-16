package design.pattern.factory;

public abstract class PizzaStore {

//    orderPizza don't actually know what's in the createPizza it only knows the type of the pizza (cheese, pepperoni etc..)
//    meaning that it doesn't know whats in the ingredient at all *** AND the style of the pizza is selected and parsed
//    as a Parameter of the abstract factory method
    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }

    protected abstract Pizza createPizza(String type);
}
