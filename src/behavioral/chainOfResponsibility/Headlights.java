package behavioral.chainOfResponsibility;

public class Headlights extends Factory {
    public Headlights(int priority) {
        super(priority);
    }

    @Override
    public void write(String massage) {
        System.out.println("Headlights condition: " + massage);
    }
}
