package observer;

import decorator.Cappuccino;
import decorator.Coffee;
import decorator.Espresso;
import decorator.WithMilk;

import java.util.Random;

public class CoffeeMaking {

    private static void printCoffee(Coffee c) {
        System.out.println("Cost: " + c.cost() + ", Description: " + c.getDescription());
    }

    public CoffeeMaking(Observer observer) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 51; i++) {
                    int upperbound = 4;
                    int randomCoffee = random.nextInt(upperbound);
                    switch(randomCoffee){
                        case 1:
                            Coffee espresso = new Espresso();
                            printCoffee(espresso);
                            try{
                                Thread.sleep(100);
                            } catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            break;
                        case 2:
                            Coffee latte = new Espresso();
                            latte = new WithMilk(latte);
                            printCoffee(latte);
                            try{
                                Thread.sleep(500);
                            } catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            break;
                        case 3:
                            Coffee cappuccino = new Espresso();
                            cappuccino = new Cappuccino(cappuccino);
                            printCoffee(cappuccino);
                            try{
                                Thread.sleep(800);
                            } catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            break;
                    }
                }
                observer.update();
            }
        });
        thread.start();
    }
}
