package generative.builder;

public class Director {
    RobotBuilder builder;

    public void setBuilder(RobotBuilder builder) {
        this.builder = builder;
    }

    Robot buildRobot() {
        builder.createRobot();
        builder.buildName();
        builder.buildTypeRobot();
        builder.buildAmount();

        return builder.getRobot();
    }
}
