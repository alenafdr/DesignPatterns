package myExample.strategy;

public class Started implements State{
    @Override
    public void doIt() {
        System.out.println("Started");
    }
}
