package behavioral.strategy;

public class Bake implements Cooking{
    @Override
    public String execute(String dish) {
        return dish + " baked!";
    }
}
