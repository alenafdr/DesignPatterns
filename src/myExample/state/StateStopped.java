package myExample.state;

public class StateStopped implements State {
    private Android android;

    public StateStopped(Android android) {
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
        System.out.println("Went to Restarted state");
        android.setState(android.getRestartedState());
    }

    @Override
    public void onDestroy() {
        System.out.println("Went to Destroyed state");
        android.setState(android.getDestroyedState());
    }
}
