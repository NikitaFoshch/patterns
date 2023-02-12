package behavioral.observer;

public class Subscribers implements Subscriber{
    String name;

    public String getName() {
        return name;
    }

    public Subscribers(String name) {
        this.name = name;
    }

    @Override
    public void getContent(String content) {
        System.out.println(getName() + " received content: " + content);
    }
}
