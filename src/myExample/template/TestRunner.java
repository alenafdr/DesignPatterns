package myExample.template;

public class TestRunner {
    public static void main(String[] args) {
        Testing testing = new TestingOnChrome();
        testing.startTests();

        testing = new TestingOnFirefox();
        testing.startTests();
    }
}
