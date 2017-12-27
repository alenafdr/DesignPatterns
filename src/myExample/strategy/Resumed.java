package myExample.strategy;

public class Resumed implements State{
    @Override
    public void doIt() {
        System.out.println("Resumed");
    }
}