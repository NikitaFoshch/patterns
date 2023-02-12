package structural.decorator;

public class ProBuilder extends Decorator {

    public ProBuilder(Builder builder) {
        super(builder);
    }


    public String makePlan() {
        return ("Make plan.");
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makePlan();
    }
}
