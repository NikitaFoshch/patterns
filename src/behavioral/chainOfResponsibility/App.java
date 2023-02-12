package behavioral.chainOfResponsibility;

public class App {
    public static void main(String[] args) {
        Factory wheelsReport = new Wheels(Priority.Stage_1);
        Factory glassReport = new Glass(Priority.Stage_2);
        Factory headlightsReport = new Headlights(Priority.Stage_3);

        wheelsReport.setNextProcess(glassReport);
        glassReport.setNextProcess(headlightsReport);

        wheelsReport.reportManager("Success", Priority.Stage_1);
        wheelsReport.reportManager("Negative", Priority.Stage_2);
        wheelsReport.reportManager("Day off", Priority.Stage_3);
    }
}
