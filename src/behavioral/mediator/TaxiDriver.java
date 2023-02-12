package behavioral.mediator;

public class TaxiDriver implements Worker {
    Chat chat;


    String name;

    public TaxiDriver(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);

    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " receives a message: " + message);

    }
}
