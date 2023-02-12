package behavioral.iterator;

public class App {
    public static void main(String[] args) {
        String[] skills = {"clean", "build", "destroy"};

        Robot robot = new Robot(skills);
        Iterator iterator = robot.getIterator();

        System.out.println("Robot skills:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
