package structural.facade;

public class Builder {


    private boolean makeJob=false;

    public void doJob(Job job){
        makeJob= true;
        System.out.println("Builder.");
        System.out.println(job.makeJob() + "\nWork done: success.\n");

    }

    public boolean getMakeJob(){
        return makeJob;
    }
}
