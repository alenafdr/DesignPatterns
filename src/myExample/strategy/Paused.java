package myExample.strategy;

public class Paused implements State{
    @Override
    public void doIt() {
        System.out.println("Paused");
    }
}
