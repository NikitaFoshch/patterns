package behavioral.comand;

public class Builder {
    Command build;
    Command repair;
    Command destroy;

    public Builder(Command build, Command repair, Command destroy) {
        this.build = build;
        this.repair = repair;
        this.destroy = destroy;
    }

    public void build(){
        build.execute();
    }

    public void repair(){
        repair.execute();
    }

    public void destroy(){
        destroy.execute();
    }


}
