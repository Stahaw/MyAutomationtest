import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount");
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		System.out.println(driver.getTitle());
		Set<String>ids = driver.getWindowHandles();
		Iterator<String>it = ids.iterator();
		String parentwindow = it.next();
		String childwindow =it.next();
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
	}

}
