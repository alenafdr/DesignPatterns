package structuralPatterns.facade;

public class Developer {
    public void doJobBeforDeadLine(BagTracker bagTracker){
        if(bagTracker.isActiveSprint()){
            System.out.println("Developer is solving problems");
        } else {
            System.out.println("Developer is reading Habrahabr");
        }
    }
}
