import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));  //Implicit Wait
	    driver.get("https://the-internet.herokuapp.com/dynamic_controls");
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000)); //Explicit Wait
	   // WebElement remove = driver.findElement(By.xpath("//button[text() = 'Remove']"));
	   // remove.click();
	    
	  //  Thread.sleep(4000);//Hardcoded Wait
	    
	    
	    //WebElement add = driver.findElement(By.xpath("//button[text() = 'Add']"));

	    //wait.until(ExpectedConditions.elementToBeClickable(add));              //Explicit Wait
	    //add.click();
	    
	    WebElement enable = driver.findElement(By.xpath("//button[text() = 'Enable']"));
	    enable.click();
	    
	   
	    WebElement input = driver.findElement(By.xpath("//input[@type = 'text']"));
	    wait.until(ExpectedConditions.elementToBeClickable(input));

	    input.sendKeys("Ayush");
	    
	    
	    
    	driver.quit();
	
	}

}
