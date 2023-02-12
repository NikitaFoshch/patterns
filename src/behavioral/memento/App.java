package behavioral.memento;

public class App {
    public static void main(String[] args) throws InterruptedException {

        Database database = new Database();
        Project project = new Project();

        project.setVersion("0.0.1");
        database.setSave(project.save());
        System.out.println("Project saving...");
        System.out.println(project);

        Thread.sleep(3000);

        project.setVersion("1.0.0");
        System.out.println("New project");
        System.out.println(project);

        project.load(database.getSave());
        System.out.println("Old project");
        System.out.println(project);

    }
}
