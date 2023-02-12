package structural.proxy;

public class Data implements Database {
    private String data;

    public Data(String data) {
        this.data = data;
    }

    @Override
    public void work() {
        System.out.println(data);
    }
}
