package advance_selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class Learnframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	    
	    driver.switchTo().frame("iframeResult");
	    driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
	    
	    Alert alert= driver.switchTo().alert();
	    alert.accept();
	    String text = driver.findElement(By.id("demo")).getText();
	    System.out.println(text);
	   
	    
	    
	    
	}

}
