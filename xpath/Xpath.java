package xpath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
    driver.findElement(By.xpath("//input[contains(@class,'inputtext _58mg')]")).sendKeys("suresh");
    driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[2]")).sendKeys("thangavel");
    driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[3]")).sendKeys("8870441317");
    driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("8870441317");
    WebElement birthdayday = driver.findElement(By.id("day")); 
    new Select(birthdayday).selectByVisibleText("17");
    WebElement birthdaymonth = driver.findElement(By.name("birthday_month")); 
    new Select(birthdaymonth).selectByVisibleText("Sep"); 
    WebElement birthdayyear = driver.findElement(By.name("birthday_year")); 
    new Select(birthdayyear).selectByVisibleText("1996");
    driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
  
    
    //driver.findElement(By.id("email")).sendKeys("8870441317");
    //driver.findElement(By.id("pass")).sendKeys("SUResh@8870");
    //driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0')]")).click();
  
    
	}

}
