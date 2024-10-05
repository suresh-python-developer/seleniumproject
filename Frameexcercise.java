package advance_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameexcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.amazon.in/");
	    driver.switchTo().frame("DAsis");
	    driver.findElement(By.xpath("//iframe[contains(@src,'iu3')]")).click();	    
	//System.out.println(text);
	}

}
