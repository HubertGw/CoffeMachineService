package decorator;

public class LatteMacchiato extends CoffeeDecorator  {

    Coffee coffee;

    public LatteMacchiato(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription(){
        return "Latte Macchiato";
    }

    @Override
    public double cost() {
        return coffee.cost() + 4.50;
    }
}