import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingCheckboxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com/");
		boolean result = driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected();
		System.out.println(result);
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		boolean result2 = driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected();
		System.out.println(result2);
		driver.quit();
		 
		
	}

}
