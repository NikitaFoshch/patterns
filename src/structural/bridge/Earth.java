package structural.bridge;

public class Earth extends Planet {
    public Earth(Machine machine) {
        super(machine);
    }

    @Override
    public void getInformation() {
        System.out.println("Getting Information by Earth...");
        machine.killAllHuman();
    }
}
