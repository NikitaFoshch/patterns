package behavioral.visitor;

public class webVisitor implements Visitor{
    @Override
    public void visit(Text text) {
        System.out.println("text");

    }

    @Override
    public void visit(Media media) {
        System.out.println("media");

    }

    @Override
    public void visit(Database database) {
        System.out.println("database");

    }
}
