package myExample.state;

public class StateDestroyed implements State {
    private Android android;

    public StateDestroyed(Android android) {
        this.android = android;
    }

    @Override
    public void onCreate() {
        System.out.println("Went to Created state");
        android.setState(android.getCreatedState());
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
        System.out.println("You can't go to Restarted state");
    }

    @Override
    public void onDestroy() {
        System.out.println("You can't go to Destroyed state");
    }
}
