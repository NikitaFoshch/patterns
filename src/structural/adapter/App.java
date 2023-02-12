package structural.adapter;

public class App {
    public static void main(String[] arg){
        Machine machine = new User();

        machine.move();
        machine.stay();
        machine.talk();

    }
}
