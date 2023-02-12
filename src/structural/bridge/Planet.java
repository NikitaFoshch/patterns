package structural.bridge;

public abstract class Planet {
    public Machine machine;

    public Planet(Machine machine){
        this.machine = machine;
    }

    public abstract void  getInformation();
}
