package myExample.strategy;

public class Created implements State{
    @Override
    public void doIt() {
        System.out.println("Created");
    }
}
