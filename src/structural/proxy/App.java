package structural.proxy;

public class App {
    public static void main(String[] arg) {
        Database database = new DataProxy("010101111100001110");

        database.work();
    }
}
