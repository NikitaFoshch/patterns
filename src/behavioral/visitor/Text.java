package behavioral.visitor;

public class Text implements Web {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
