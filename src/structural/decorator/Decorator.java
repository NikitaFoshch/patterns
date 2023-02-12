package structural.decorator;

public class Decorator implements Builder {

    Builder builder;

    public Decorator(Builder builder) {
        this.builder = builder;
    }

    @Override
    public String makeJob() {
        return builder.makeJob();
    }
}
