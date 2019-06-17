import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTests {

    WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        // Created object of DesiredCapabilities class.
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "Sony");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");

        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }

    @Test
    public void firstTest() {
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_1']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/op_add']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_1']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/eq']")).click();
    }
}