import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class basics extends base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = capabilities();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
    }
}
