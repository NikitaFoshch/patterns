package structural.facade;

public class Director {

    public void checkJob(boolean makeJob,Job job) {
        System.out.println("Director.");
        if (makeJob){
            System.out.println(job.makeJob() + "\nCheck job: success." + "\nWork done: success.\n");
        }else {
            System.out.println(job.makeJob() + "\nCheck job: success." + "\nWork done: negative.\n");
        }


    }
}
