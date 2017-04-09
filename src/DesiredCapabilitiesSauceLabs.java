import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DesiredCapabilitiesSauceLabs {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability("version", "5");
		dc.setCapability("platform", "XP");
		WebDriver driver = new RemoteWebDriver(new URL("http://Ciho:147cd218-c452-4a39-8e87-773ea0641d7e@ondemand.saucelabs.com:80/wd/hub"), dc);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}
