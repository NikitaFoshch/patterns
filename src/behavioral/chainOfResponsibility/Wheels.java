package behavioral.chainOfResponsibility;

public class Wheels extends Factory {
    public Wheels(int priority) {
        super(priority);
    }

    @Override
    public void write(String massage) {
        System.out.println("Wheel condition: " + massage);
    }
}
