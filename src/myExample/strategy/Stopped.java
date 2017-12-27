package myExample.strategy;

public class Stopped implements State{
    @Override
    public void doIt() {
        System.out.println("Stopped");
    }
}
