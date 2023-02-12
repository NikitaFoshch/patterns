package behavioral.strategy;

public class Roasting implements Cooking{


    @Override
    public String execute(String dish) {
        return dish + " roasting well done!";
    }
}
