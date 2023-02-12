package generative.builder;

public class Robot {
    private String name;
    private TypeRobot typeRobot;
    private int amount;

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeRobot(TypeRobot typeRobot) {
        this.typeRobot = typeRobot;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", typeRobot=" + typeRobot +
                ", amount=" + amount +
                '}';
    }
}
