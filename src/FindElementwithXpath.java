import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementwithXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qaclickacademy.com");
		driver.findElement(By.xpath(".//*[@id='homepage']/header/div[2]/div/nav/ul/li[2]/a")).click();
		driver.close();
	}


	}


