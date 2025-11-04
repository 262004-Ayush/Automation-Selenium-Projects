import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class expressionLocators {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);

	WebElement username = driver.findElement(By.xpath("//input[@name='email']")); //1.XPATH BYT SINGLE ATTRIBUTE
	username.sendKeys("2323923300");
	Thread.sleep(2000);
	
	//WebElement password = driver.findElement(By.cssSelector("input[type='password']")); // CSS SELECTOR
	//WebElement password = driver.findElement(By.xpath("//input[@placeholder= 'Password' and @aria-label= 'Password']")); //4.XPATH BY MUL.ATTRIBUTE
	WebElement password = driver.findElement(By.xpath("(//input[contains(@class, 'inputtext _55r1')])[2]")); //5.XPATH BY INDEXING
	password.sendKeys("Ehdsfkfkfk");
	Thread.sleep(2000);
	
	//WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));	 //2.XPATH BY TEXT FUNCTTION
    //WebElement loginButton = driver.findElement(By.xpath("//button[contains(@name, 'logi')]")); //3.XPATH BY CONTAINS METHOD WITH ATTRIBUTE

	WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(), 'Log i')]")); //3.XPATH BY CONTAINS METHOD WITH TEXT FUNCTION
	
	loginButton.click();
	Thread.sleep(5000);
	
	
	driver.quit();
	
}



}
