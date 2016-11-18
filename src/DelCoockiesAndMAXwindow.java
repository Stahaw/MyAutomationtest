import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DelCoockiesAndMAXwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com");
		Set<Cookie>adc = driver.manage().getCookies();
		System.out.println(adc.size());
		driver.manage().deleteAllCookies();
		Set<Cookie>adcd = driver.manage().getCookies();
		System.out.println(adcd.size());
		driver.close();
	}

}
