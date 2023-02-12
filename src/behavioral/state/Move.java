package behavioral.state;

public class Move implements State{
    @Override
    public void action() {
        System.out.println("Move...");
    }
}
