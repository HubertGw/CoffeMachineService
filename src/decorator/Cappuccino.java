package decorator;

public class Cappuccino extends CoffeeDecorator{

    Coffee coffee;

    public Cappuccino(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return  "Cappuccino";
    }

    @Override
    public double cost() {
        return coffee.cost() + 3.50;
    }
}
