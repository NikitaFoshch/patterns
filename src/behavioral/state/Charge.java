package behavioral.state;

public class Charge implements State{
    @Override
    public void action() {
        System.out.println("Charge...");
    }
}
