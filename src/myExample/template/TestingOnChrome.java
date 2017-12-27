package myExample.template;

public class TestingOnChrome extends Testing {
    @Override
    public void startDriver() {
        System.out.println("Starting driver for Chrome");
    }

    @Override
    public void stopDriver() {
        System.out.println("Stopping driver for Chrome");
    }
}
