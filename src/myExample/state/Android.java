package myExample.state;

public class Android {
    private State currentState;
    private State created;
    private State started;
    private State resumed;
    private State paused;
    private State restarted;
    private State stopped;
    private State destroyed;

    public Android() {
        this.created = new StateCreated(this);
        this.started = new StateStarted(this);
        this.resumed = new StateResumed(this);
        this.paused = new StatePaused(this);
        this.restarted = new StateRestarted(this);
        this.stopped = new StateStopped(this);
        this.destroyed = new StateDestroyed(this);
        this.currentState = created;
    }


    public void onCreate() {
        currentState.onCreate();
    }

    public void onStart() {
        currentState.onStart();
    }

    public void onResume() {
        currentState.onResume();
    }

    public void onPause() {
        currentState.onPause();
    }

    public void onStop() {
        currentState.onStop();
    }

    public void onRestart() {
        currentState.onRestart();
    }

    public void onDestroy() {
        currentState.onDestroy();
    }

    public void setState(State state){
        this.currentState = state;
    }

    public State getCreatedState() {
        return created;
    }

    public State getStartedState() {
        return started;
    }

    public State getResumedState() {
        return resumed;
    }

    public State getPausedState() {
        return paused;
    }

    public State getRestartedState() {
        return restarted;
    }

    public State getStoppedState() {
        return stopped;
    }

    public State getDestroyedState() {
        return destroyed;
    }

    @Override
    public String toString() {
        return "Android " +
                "currentState=" + currentState.getClass().getName().substring(16) + "\n";
    }
}
