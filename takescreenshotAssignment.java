import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takescreenshotAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		TakesScreenshot tks = (TakesScreenshot) driver;
		File facebooksrc = tks.getScreenshotAs(OutputType.FILE);   // 1. FaceBook SS
		File facebookdest = new File("./Takescreenshot/fbscreenshot.png");    
		FileHandler.copy(facebooksrc, facebookdest);
		Thread.sleep(2000);
		
		WebElement FBform = driver.findElement(By.className("_9vtf"));
		File fbformsrc = FBform.getScreenshotAs(OutputType.FILE);   // 2. FaceBook Form SS
		File fbformdest = new File("./Takescreenshot/fbformss.png");    
		FileHandler.copy(fbformsrc, fbformdest);
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.zomato.com/");
		File zomatosrc = tks.getScreenshotAs(OutputType.FILE);   // 3. Zomato SS
		File zomatodest = new File("./Takescreenshot/zomatoscreenshot.png"); 
		FileHandler.copy(zomatosrc, zomatodest);
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.swiggy.com/");
		File swiggysrc = tks.getScreenshotAs(OutputType.FILE);   // 4. Swiggy SS
		File swiggydest = new File("./Takescreenshot/swiggyscreenshot.png"); 
		FileHandler.copy(swiggysrc, swiggydest);
		Thread.sleep(2000);
		
		driver.quit();
			
	}
	
	
	
}
