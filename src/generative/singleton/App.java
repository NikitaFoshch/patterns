package generative.singleton;

public class App {
    public static void main(String[] arg) {
        Pizza.getDough().addText("Passed the dough.");
        Pizza.getDough().showText();
    }
}
