import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
     public static void main(String[] args) throws InterruptedException {
		
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    Thread.sleep(4000);
    
    
    WebElement username = driver.findElement(By.name("email"));
    username.sendKeys("9871205512");
    
    Thread.sleep(2000);
  
    WebElement password = driver.findElement(By.xpath("//input[contains(@class = 'inputtext _55r1 _6luy _9npi')]"));	
    password.sendKeys("WHITEDEVIL");
    
    Thread.sleep(2000); 
    
    WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(), 'Log in')]"));	
    loginButton.click();
    
    Thread.sleep(50000);
    
    	 
    	 
    driver.quit();	 
    	 
	}
	
     
	
}
