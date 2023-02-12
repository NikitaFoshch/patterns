package behavioral.comand;

public class RepairCommand implements Command{
    AnObject anObject;

    public RepairCommand(AnObject anObject) {
        this.anObject = anObject;
    }


    @Override
    public void execute() {
        anObject.repair();
    }
}
