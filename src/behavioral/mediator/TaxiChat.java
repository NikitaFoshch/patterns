package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class TaxiChat implements Chat {
    Worker operator;
    List<Worker> taxiDriver = new ArrayList<>();

    public void setOperator(Worker operator) {
        this.operator = operator;
    }

    public void addTaxiDriverToChat(Worker worker) {
        taxiDriver.add(worker);
    }

    @Override
    public void sendMessage(String message, Worker worker) {
        for (Worker driver : taxiDriver) {
            if (driver != worker) {
                driver.getMessage(message);
            }
        }
        if (worker != operator) {
            operator.getMessage(message);
        }


    }
}
