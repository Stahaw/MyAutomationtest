import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		System.out.println("Links on the page");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		System.out.println("Links of the footer");
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement column2 = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println("Links of the column number two");
		System.out.println(column2.findElements(By.tagName("a")).size());
		String  BeforeClicking  =null;
		String AfterClicking;
		
		for(int i = 0; i<column2.findElements(By.tagName("a")).size(); i++){
			//System.out.println(column2.findElements(By.tagName("a")).get(i).getText());
			if(column2.findElements(By.tagName("a")).get(i).getText().contains("Site map")) {
				BeforeClicking = driver.getTitle();
				column2.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
				AfterClicking = driver.getTitle();

		if( BeforeClicking !=AfterClicking){
			if( driver.getPageSource().contains("sitemap")){
				System.out.println("PASS");
			}else{
				System.out.println("FAIL");
			}
		}
		driver.close();
	}
}
	

		

	
	


