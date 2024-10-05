package advance_selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.irctc.co.in/nget/train-search");
	    driver.findElement(By.linkText("FLIGHTS")).click();
	    Set<String> windowHandles = driver.getWindowHandles();
	    System.out.println(windowHandles);
	    ArrayList<String> arrayList = new ArrayList<String>(windowHandles);
	    System.out.println(arrayList);
	    String pw_title =  driver.switchTo().window(arrayList.get(0)).getTitle();
	    System.out.println("parent window title :"+pw_title);
	    File sourcefile = driver.getScreenshotAs(OutputType.FILE );
	    File dest = new File ("snap/shot.jpg");
	    FileUtils.copyFile(sourcefile, dest);
	    String cw_title =  driver.switchTo().window(arrayList.get(1)).getTitle();
	    System.out.println("child window title:"+cw_title);
	    driver.close();
	  
	
	}

}
