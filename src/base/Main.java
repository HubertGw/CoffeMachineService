package base;

import observer.CoffeeMachine;
import observer.CoffeeMaking;

public class Main {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();
        CoffeeMachine cm1 = CoffeeMachine.getInstance();
        coffeeMachine.name = "Ekspres Siemens";
        cm1.name = "Ekspres Delonghi";
        System.out.println(cm1.name + " " + coffeeMachine.name);
        CoffeeMaking coffeeMaking = new CoffeeMaking(coffeeMachine);
    }
}
