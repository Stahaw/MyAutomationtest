import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VisibleandInvisiblemodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/flights");
		System.out.println("Before Clicking on multy city radiobutton");
		System.out.println(driver.findElement(By.xpath(".//*[@id='start_date_sec']")).isDisplayed());
		driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();
		System.out.println("After Clicking on multy city radiobutton");
		System.out.println(driver.findElement(By.xpath(".//*[@id='start_date_sec']")).isDisplayed());
		
		//without isdisplayed method
		int sizeofbuttons = driver.findElements(By.xpath(".//*[@id='mult_city_button']/span")).size();
		if(sizeofbuttons == 0){
			System.out.println("Verified");
		}else{
			System.out.println("Failed");
		}
		driver.quit();
	}

}
