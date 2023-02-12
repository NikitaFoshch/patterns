package structural.bridge;

public class CoffeeMachine implements Machine{
    @Override
    public void killAllHuman() {
        System.out.println("Made coffee");
    }
}
