import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionMethods {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.facebook.com/");
	
	WebElement forgoton = driver.findElement(By.partialLinkText("Forgotten"));
	
	Thread.sleep(3000);
	
	Actions act = new Actions(driver);
   // act.moveToElement(forgoton).build().perform();
	
	//act.moveByOffset(131, 16);
	
	//act.click(forgoton).build().perform();
	
	act.contextClick(forgoton).build().perform();
	
	Thread.sleep(2000);
	
	//act.click(forgoton).build().perform(); //2. left click(element)
	//act.click().build().perform();      //2.left click
	
	//act.contextClick().build().perform();     //3. context click -- right click
	//act.contextClick(forgoton).build().perform(); // 3. context click(element)
	
	
	//Thread.sleep(3000);
	
	
	driver.quit();
}
}
