package behavioral.strategy;

public class App {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.setDish(new Bake());
        System.out.println(restaurant.getExecute("Meat"));

        restaurant.setDish(new Boil());
        System.out.println(restaurant.getExecute("Meat"));

        restaurant.setDish(new Roasting());
        System.out.println(restaurant.getExecute("Meat"));

    }
}
