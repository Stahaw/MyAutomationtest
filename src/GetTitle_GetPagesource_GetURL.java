import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle_GetPagesource_GetURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://qaclickacademy.com");
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getPageSource());
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.findElement(By.xpath(".//*[@id='myCarousel']/div/div/div/div/div[1]/p")).getText());
	    driver.close();
	    

	}
	}

