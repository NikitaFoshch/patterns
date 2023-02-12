package structural.composite;


public class App {
    public static void main(String[] args) {
        Team team = new Team();

        Builder firstWorker = new Worker();
        Builder secondWorker = new Worker();
        Builder engineer = new Engineer();

        team.addBuilders(firstWorker);
        team.addBuilders(secondWorker);
        team.addBuilders(engineer);

        team.builds();

        team.removeBuilders(firstWorker);
        team.removeBuilders(secondWorker);
        team.removeBuilders(engineer);

        team.builds();
    }
}
