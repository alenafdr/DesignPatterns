package myExample.strategy;


public class Android {
    State currentState;

    public void setState(State state){
        this.currentState = state;
    }

    public void execute(){
        if(currentState != null){
            currentState.doIt();
        } else {
            System.out.println("Current state is null");
        }

    }

    @Override
    public String toString() {
        return "Android " +
                "currentState=" + currentState.getClass().getName().substring(16) + "\n";
    }
}
