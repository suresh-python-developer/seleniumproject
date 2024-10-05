package advance_selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learnalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	    ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.leafground.com/alert.xhtml");
	    driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']/span[2]")).click();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert= driver.switchTo().alert();
	    alert.sendKeys("suresh");
	    alert.accept();
	    
	    String text = driver.findElement(By.id("confirm_result")).getText();
	    System.out.println(text);
	    
	    
	    
	    
	}
	
	

}
