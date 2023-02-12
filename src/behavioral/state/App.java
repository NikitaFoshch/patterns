package behavioral.state;

public class App {
    public static void main(String[] args) {
        State charge = new Charge();
        Robot robot = new Robot();

        robot.setState(charge);
        for (int i = 0; i < 5; i++) {
            robot.doAction();
            robot.changeState();
        }

    }
}
