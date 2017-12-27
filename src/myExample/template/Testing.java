package myExample.template;

public abstract class Testing {
    public void startTests(){
        startDriver();
        executeTests();
        stopDriver();
    }

    public abstract void startDriver();
    public void executeTests(){
        System.out.println("Site is testing");
    }
    public abstract void stopDriver();
}
