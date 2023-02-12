package structural.bridge;

public class Mars extends Planet {
    public Mars(Machine machine) {
        super(machine);
    }

    @Override
    public void getInformation() {
        System.out.println("Getting  by Mars...");
        machine.killAllHuman();
    }
}
