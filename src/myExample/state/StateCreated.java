package myExample.state;

public class StateCreated implements State {
    private Android android;

    public StateCreated(Android android) {
        this.android = android;
    }

    @Override
    public void onCreate() {
        System.out.println("You can't go to Created state");
    }

    @Override
    public void onStart() {
        System.out.println("Went to Started state");
        android.setState(android.getStartedState());
    }

    @Override
    public void onResume() {
        System.out.println("You can't go to Resumed state");
    }

    @Override
    public void onPause() {
        System.out.println("You can't go to Paused state");
    }

    @Override
    public void onStop() {
        System.out.println("You can't go to Stopped state");
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
