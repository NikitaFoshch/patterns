package structural.composite;


public class Worker implements Builder {
    @Override
    public void builds(){
        System.out.println("Build!");
    }
}
