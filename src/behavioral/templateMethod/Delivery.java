package behavioral.templateMethod;

public abstract class Delivery {
    public void execute(){
        System.out.println("Take order");
        System.out.println("Order on the way");
        individualExecute();
    }

    public abstract void individualExecute();
}
