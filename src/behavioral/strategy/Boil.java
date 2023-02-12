package behavioral.strategy;

public class Boil implements Cooking{
    @Override
    public String execute(String dish) {
        return dish + " welded!";
    }
}
