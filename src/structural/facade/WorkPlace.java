package structural.facade;

public class WorkPlace {
    Job job = new Job();
    Director director = new Director();
    Builder builder = new Builder();

    public void process(){
        director.checkJob(builder.getMakeJob(), job);
        builder.doJob(job);
        director.checkJob(builder.getMakeJob(), job);
    }

}
