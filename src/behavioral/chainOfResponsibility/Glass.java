package behavioral.chainOfResponsibility;

public class Glass extends Factory {
    public Glass(int priority) {
        super(priority);
    }

    @Override
    public void write(String massage) {
        System.out.println("Glass condition: " + massage);
    }
}
