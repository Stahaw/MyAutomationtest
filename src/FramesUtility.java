import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://fantasycricket.dream11.com/IN/");
		int number= SwitchToFrame(driver,By.xpath(".//*[@id='recaptcha-anchnor']/div[5]" ));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath(".//*[@id='recaptcha-anchnor']/div[5]" )).click();
	

	}
	public static int SwitchToFrame(WebDriver driver, By by){
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();
		for(i=0;i<framecount;i++){
		driver.switchTo().frame(i);
		int count = driver.findElements(by).size();
			if (count>0)
			{
				//driver.findElement(By.xpath(".//*[@id='recaptcha-anchnor']/div[5]")).click();
				break;
			}
			else
			{
				System.out.println("Continue looping");
			}
	}
		driver.switchTo().defaultContent();
		return i;

}

	}


