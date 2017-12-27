package myExample.state;

public interface State {
    public void onCreate();
    public void onStart();
    public void onResume();
    public void onPause();
    public void onStop();
    public void onRestart();
    public void onDestroy();
}
