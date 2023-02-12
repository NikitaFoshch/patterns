package behavioral.templateMethod;

public class Glovo extends Delivery{
    @Override
    public void individualExecute() {
        System.out.println("Your food has been delivered");
    }
}
