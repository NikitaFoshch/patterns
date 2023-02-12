package generative.builder;

public class App {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new KillBot());
        Robot robot = director.buildRobot();
        System.out.println(robot);

        director.setBuilder(new DefenderBot());
        Robot robot1 = director.buildRobot();
        System.out.println(robot1);
    }
}
