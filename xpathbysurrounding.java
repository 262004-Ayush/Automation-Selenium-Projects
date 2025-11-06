import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpathbysurrounding {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id = 'newsletter-email']"));
		email.sendKeys("ayushrawat2324@gmail.com");
		
		Thread.sleep(3000);
		
		
		//CLICK ON RADIO BUTTON BY USING XPATH BY SURROUNIDNG BECAUSE DUPLICACY OF INPUT AND NO ID OR NAME GIVEN FOR RADIO INPUT FILEDS 
		
		WebElement radio1 = driver.findElement(By.xpath("//label[text() = 'Excellent']/..//input"));
		radio1.click();
		
		Thread.sleep(2000);
		
		WebElement radio3 = driver.findElement(By.xpath("//label[text() = 'Poor']/..//input"));
		radio3.click();
		
		Thread.sleep(2000);
		
		WebElement radio2 = driver.findElement(By.xpath("//label[text() = 'Good']/..//input"));
		radio2.click();
		
		Thread.sleep(2000);
		
		WebElement radio4 = driver.findElement(By.xpath("//label[text() = 'Very bad']/..//input"));
		radio4.click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
