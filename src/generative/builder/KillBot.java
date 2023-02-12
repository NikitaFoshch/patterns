package generative.builder;

public class KillBot extends RobotBuilder {
    @Override
    void buildName() {
        robot.setName("Bender");
    }

    @Override
    void buildTypeRobot() {
        robot.setTypeRobot(TypeRobot.KillBot);
    }

    @Override
    void buildAmount() {
        robot.setAmount(10);
    }
}
