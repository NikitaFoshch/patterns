package behavioral.observer;

public class App {
    public static void main(String[] args) {
        Observed apple = new Apple();
        Subscriber subscriber_1 = new Subscribers("Tom Hardy");
        Subscriber subscriber_2 = new Subscribers("Boris Hardy");
        Subscriber subscriber_3 = new Subscribers("Tony Hardy");


        apple.addSubscriber(subscriber_1);
        apple.addSubscriber(subscriber_2);
//        apple.removeSubscriber(subscriber_2);
        apple.addSubscriber(subscriber_3);
        apple.sendContent("50% off Macbook this week only!");
    }
}
