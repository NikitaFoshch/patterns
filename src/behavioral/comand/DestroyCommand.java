package behavioral.comand;

public class DestroyCommand implements Command{
    AnObject anObject;

    public DestroyCommand(AnObject anObject) {
        this.anObject = anObject;
    }

    @Override
    public void execute() {
        anObject.destroy();
    }
}
