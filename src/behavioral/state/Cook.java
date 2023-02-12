package behavioral.state;

public class Cook implements State{
    @Override
    public void action() {
        System.out.println("Cook...");
    }
}
