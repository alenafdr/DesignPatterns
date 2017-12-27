package myExample.factory;

public class DriverFactory {
    public Driver getDriver(String nameDriver){
        if (nameDriver.equalsIgnoreCase("chrome")){
            return new ChromeDriver();
        } else if (nameDriver.equalsIgnoreCase("firefox")) {
            return new FirefoxDriver();
        } else {
            throw new RuntimeException(nameDriver + " is not found");
        }
    }
}
