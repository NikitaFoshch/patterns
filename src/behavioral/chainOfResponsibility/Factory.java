package behavioral.chainOfResponsibility;

public abstract class Factory {
    public int priority;
    public Factory nextProcess;

    public Factory(int priority) {
        this.priority = priority;
    }

    public void setNextProcess(Factory nextProcess) {
        this.nextProcess = nextProcess;
    }

    public void reportManager(String massage, int level) {
        if (level >= priority) {
            write(massage);
        }
        if (nextProcess != null) {
            nextProcess.reportManager(massage, level);
        }
    }

    public abstract void write(String massage);
}
