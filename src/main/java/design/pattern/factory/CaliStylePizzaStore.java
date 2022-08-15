package design.pattern.factory;

public class CaliStylePizzaStore extends PizzaStore{


    @Override
    Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new CaliStyleCheesePizza();
            case "veggie":
                return new CaliStyleVeggiePizza();
            case "clam":
                return new CaliStyleClamPizza();
            case "pepperoni":
                return new CaliStylePepperoniPizza();
            default:
                return null;
        }
    }
}
