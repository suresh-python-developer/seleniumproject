package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonscreen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		

		//step 1 takesnap
		File scr = driver.getScreenshotAs(OutputType.FILE);

		//step 2 set the path to be stored
		File dest=new File("./src/main/java/screenshot/img.png");

		//step 3
		FileUtils.copyFile(scr, dest);	
		

	}

}
