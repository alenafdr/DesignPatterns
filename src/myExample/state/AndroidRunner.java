package myExample.state;

public class AndroidRunner {
    public static void main(String[] args) {
        Android android = new Android();
        System.out.println(android);

        android.onCreate();
        System.out.println(android);
        android.onStop();
        System.out.println(android);
        android.onStart();
        System.out.println(android);
        android.onResume();
        System.out.println(android);
        android.onPause();
        System.out.println(android);
        android.onStop();
        System.out.println(android);
        android.onRestart();
        System.out.println(android);
        android.onStart();
        System.out.println(android);
        android.onStop();
        System.out.println(android);
        android.onDestroy();
        System.out.println(android);
    }
}
