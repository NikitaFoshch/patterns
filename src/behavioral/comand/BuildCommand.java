package behavioral.comand;

public class BuildCommand implements Command{
    AnObject anObject;

    public BuildCommand(AnObject anObject) {
        this.anObject = anObject;
    }

    @Override
    public void execute() {
        anObject.build();
    }
}
