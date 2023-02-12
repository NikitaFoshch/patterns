package structural.decorator;

public class Architector extends Decorator {

    public Architector(Builder builder) {
        super(builder);
    }

    public String makeDesign() {
        return "Make design.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeDesign();
    }
}
