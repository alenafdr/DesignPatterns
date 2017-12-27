package myExample.factory;

public class FirefoxDriver implements Driver {
    @Override
    public void runDriver() {
        System.out.println("Run driver for Firefox");
    }
}
