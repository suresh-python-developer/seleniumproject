package advance_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://snapdeal.com/");
	    WebElement wb = driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
	    
	    Actions object = new Actions(driver);
	    object.moveToElement(wb).perform();
	
	}

}
