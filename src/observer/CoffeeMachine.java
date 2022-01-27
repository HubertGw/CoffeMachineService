package observer;

public class CoffeeMachine implements Observer{

    private static CoffeeMachine instance = null;
    public String name;

    private CoffeeMachine(){
        System.out.println("Ekspres wybrany");
    }

    public static synchronized CoffeeMachine getInstance(){
        if(instance == null)
            instance = new CoffeeMachine();

        return instance;
    }

    @Override
    public void update() {
        System.out.println("Opróżnij pojemnik na fusy!");
    }
}
