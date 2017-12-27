package structuralPatterns.facade;

public class Workflow {
    Developer developer = new Developer();
    Job job = new Job();
    BagTracker bagTracker = new BagTracker();

    public void solvedProblems(){
        job.doJob();
        bagTracker.startSprint();
        developer.doJobBeforDeadLine(bagTracker);
    }
}
