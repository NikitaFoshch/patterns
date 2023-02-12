package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Apple implements Observed{
    List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void sendContent(String content) {
        for (Subscriber subscriber : subscribers)
            subscriber.getContent(content);
    }

}
