package generative.builder;

public abstract class RobotBuilder {
    Robot robot;

    void createRobot(){
        robot = new Robot();
    }
    abstract void buildName();
    abstract void buildTypeRobot();
    abstract void buildAmount();

    public Robot getRobot() {
        return robot;
    }
}
