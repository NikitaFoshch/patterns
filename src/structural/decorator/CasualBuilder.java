package structural.decorator;

public class CasualBuilder implements Builder {
    @Override
    public String makeJob() {
        return ("Build house.");
    }
}
