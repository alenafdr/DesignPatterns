package myExample.strategy;

public class StrategyRunner {
    public static void main(String[] args) {
        Android android = new Android();

        android.setState(new Created());
        android.execute();

        android.setState(new Started());
        android.execute();

        android.setState(new Resumed());
        android.execute();

        android.setState(new Paused());
        android.execute();

        android.setState(new Stopped());
        android.execute();

        android.setState(new Destroyed());
        android.execute();
    }
}
