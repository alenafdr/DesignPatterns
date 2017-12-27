package myExample.state;

public class StateStarted implements State {
    Android android;

    public StateStarted(Android android) {
        this.android = android;
    }

    @Override
    public void onCreate() {
        System.out.println("You can't go to Created state");
    }

    @Override
    public void onStart() {
        System.out.println("You can't go to Started state");
    }

    @Override
    public void onResume() {
        System.out.println("Went to Resumed state");
        android.setState(android.getResumedState());
    }

    @Override
    public void onPause() {
        System.out.println("You can't go to Paused state");
    }

    @Override
    public void onStop() {
        System.out.println("Went to Stopped state");
        android.setState(android.getStoppedState());
    }

    @Override
    public void onRestart() {
        System.out.println("You can't go to Restarted state");
    }

    @Override
    public void onDestroy() {
        System.out.println("You can't go to Destroyed state");
    }
}
