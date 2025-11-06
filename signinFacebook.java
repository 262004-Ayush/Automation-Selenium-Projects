import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class signinFacebook {
   public static void main(String[] args) throws InterruptedException {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	
	   Thread.sleep(2000);
	   
	   WebElement email  = driver.findElement(By.xpath("//input[@name = 'email']"));
	   email.sendKeys("ayushrawat9517572@gmail.com");
	   Thread.sleep(2000);
	   
	   WebElement password  = driver.findElement(By.cssSelector("input[name = 'pass']"));
	   password.sendKeys("Ayush@2027575756");
	   Thread.sleep(2000);
	   
	  
	   WebElement login = driver.findElement(By.xpath("//button[text() = 'Log in']"));
	   login.click();
	   Thread.sleep(7000);
	   
	   driver.navigate().back();
	   Thread.sleep(3000);
	   
	   driver.navigate().forward();
	   //Thread.sleep(3000);
	   
	   Thread.sleep(5000);
	   driver.quit();
	   
		}
}

