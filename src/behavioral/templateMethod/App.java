package behavioral.templateMethod;

public class App {
    public static void main(String[] args) {
        Delivery glovo = new Glovo();
        Delivery epicentr= new Epicentr();

        glovo.execute();
        System.out.println("=====================");
        epicentr.execute();
    }
}
