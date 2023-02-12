package behavioral.comand;

public class App {
    public static void main(String[] args) {
        AnObject anObject = new AnObject();

        Builder builder = new Builder(
                new BuildCommand(anObject),
                new RepairCommand(anObject),
                new DestroyCommand(anObject)
        );
        builder.build();
        builder.repair();
        builder.destroy();

    }
}
