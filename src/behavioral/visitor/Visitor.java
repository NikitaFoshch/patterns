package behavioral.visitor;

public interface Visitor {
    void visit(Text text);

    void visit(Media media);

    void visit(Database database);
}
