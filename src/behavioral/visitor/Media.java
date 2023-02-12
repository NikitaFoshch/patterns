package behavioral.visitor;

public class Media implements Web{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
