package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        List<WebElement> elements =  driver.findElements(By.tagName("a"));
        int size = elements.size();
        System.out.println(size);	
        
        for (int i = 0; i < elements.size(); i++) {
        	String elements2 =elements.get(i).getText();	
            System.out.println(elements2);	
            	
			
		}
	
	}

}
