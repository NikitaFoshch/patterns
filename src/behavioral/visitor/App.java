package behavioral.visitor;

public class App {
    public static void main(String[] args) {
        Web computer = new Database();
        computer.accept(new webVisitor());
    }
}
