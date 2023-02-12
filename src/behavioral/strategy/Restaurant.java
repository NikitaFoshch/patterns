package behavioral.strategy;

public class Restaurant {
    Cooking cooking;

    public void setDish(Cooking cooking) {
        this.cooking = cooking;
    }
     public String getExecute(String dish){
        return cooking.execute(dish);
     }
}
