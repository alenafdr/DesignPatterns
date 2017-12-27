package myExample.template;

public class TestingOnFirefox extends Testing {
    @Override
    public void startDriver() {
        System.out.println("Starting driver for Firefox");
    }

    @Override
    public void stopDriver() {
        System.out.println("Stopping driver for Firefox");
    }
}
