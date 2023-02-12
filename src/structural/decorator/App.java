package structural.decorator;

public class App {
    public static void main(String[] arg) {
        Builder builder = new Architector(new CasualBuilder());
        Builder builder1 = new ProBuilder(new CasualBuilder());
        System.out.println(builder1.makeJob());
        System.out.println(builder.makeJob());
    }

}
