package myExample.strategy;

public class Destroyed implements State{
    @Override
    public void doIt() {
        System.out.println("Destroyed");
    }
}
