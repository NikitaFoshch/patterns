package behavioral.mediator;

public class App {
    public static void main(String[] args) {
        TaxiChat taxiChat = new TaxiChat();

        Worker operator = new TaxiOperator(taxiChat, "Operator");
        Worker driver_1 = new TaxiDriver(taxiChat, "Driver_1");
        Worker driver_2 = new TaxiDriver(taxiChat, "Driver_2");
        Worker driver_3 = new TaxiDriver(taxiChat, "Driver_3");

        taxiChat.setOperator(operator);
        taxiChat.addTaxiDriverToChat(driver_1);
        taxiChat.addTaxiDriverToChat(driver_2);
        taxiChat.addTaxiDriverToChat(driver_3);


        operator.sendMessage("Hello Driver!");
        driver_1.sendMessage("Hello Guys!");


    }
}
