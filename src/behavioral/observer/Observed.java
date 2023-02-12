package behavioral.observer;

public interface Observed {
    public void  addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void sendContent(String content);
}
