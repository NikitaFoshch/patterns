package generative.builder;

public class DefenderBot extends RobotBuilder {
    @Override
    void buildName() {
        robot.setName("Jony3volta");
    }

    @Override
    void buildTypeRobot() {
        robot.setTypeRobot(TypeRobot.DefenderBot);
    }

    @Override
    void buildAmount() {
        robot.setAmount(100);
    }
}
