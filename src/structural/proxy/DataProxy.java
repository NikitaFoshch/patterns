package structural.proxy;

public class DataProxy implements Database {
    private String data;
    private Data dataProxy;

    public DataProxy(String data) {
        this.data = data;
        record();
    }

    public void record() {
        System.out.println("Data saved....");
    }


    @Override
    public void work() {
        if (dataProxy == null) {
            dataProxy = new Data(data);
        }
        dataProxy.work();
    }
}
