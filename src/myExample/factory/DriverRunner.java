package myExample.factory;

public class DriverRunner {
    public static void main(String[] args) {
        DriverFactory df = new DriverFactory();

        Driver driver = df.getDriver("firefox");
        driver.runDriver();

        driver = df.getDriver("chrome");
        driver.runDriver();
    }
}
