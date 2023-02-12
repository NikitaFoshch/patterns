package structural.bridge;

public class App {
    public static void main(String[] args) {
        Planet[] planets={
            new Earth(new Bender()),
            new Mars(new CoffeeMachine())
        };

        for(Planet planet: planets){
            planet.getInformation();
        }
    }
}
