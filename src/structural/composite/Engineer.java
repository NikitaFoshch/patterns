package structural.composite;


public class Engineer implements Builder {
    @Override
    public void builds(){
        System.out.println("Make Project!");
    }
}
