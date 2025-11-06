import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class xpathbysurroundingfacebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
		email.sendKeys("ayushrawat238@gmai.com");
		Thread.sleep(3000);
		
		WebElement female = driver.findElement(By.xpath("//label[text() = 'Female']/..//input"));
		female.click();
	    Thread.sleep(2000);
		
	    WebElement male = driver.findElement(By.xpath("//label[text() = 'Male']/..//input"));
		male.click();
	    Thread.sleep(2000);
	
	    WebElement custom = driver.findElement(By.xpath("//label[text() = 'Custom']/..//input"));
		custom.click();
	    Thread.sleep(2000);
		
	    WebElement preferedpro = driver.findElement(By.xpath("//select[@id = 'preferred_pronoun']"));
	    preferedpro.click();
	    Thread.sleep(2000);
		
	    WebElement value2 = driver.findElement(By.xpath("(//option[@value = '2'])[3]"));
	    value2.click();
		
        Thread.sleep(10000);
		
		driver.quit();
		

	
		
}
	
	
	
	
	
}
