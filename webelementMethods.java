import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementMethods {
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		//WebElement Methods
		//A. Action Methods
		
		WebElement username = driver.findElement(By.id("email"));
		
		WebElement loginbtn = driver.findElement(By.name("login"));
		
		username.sendKeys("Ayush Rawat"); // 1.sendkeys method
		
		Thread.sleep(3000);
		
		username.clear(); // 2. clear method
		
		Thread.sleep(3000);
		username.sendKeys("Selenium by Ayush");
		
		//loginbtn.submit(); // 3. submit method
		Thread.sleep(3000);
		
		//loginbtn.click(); // 4. click method
		
		//B. Getters method
		
		String tagoflogin = loginbtn.getTagName(); //1. getTagname method
		System.out.println(tagoflogin);
		
		String loginclass = loginbtn.getAttribute("class"); //2. getattribute method
		System.out.println(loginclass);
		
		String bgcolorlogin = loginbtn.getCssValue("background-color"); //3. getCssvalue method
		System.out.println(bgcolorlogin);
		
		String logintext = loginbtn.getText(); //4. getText method
		System.out.println(logintext);
		
		// size and location
		
		// 5. getsize method
		
		Dimension dim = loginbtn.getSize();
		System.out.println(dim.getWidth());
		System.out.println(dim.getHeight());
		
		//6. getlocation method
		
		Point poi = loginbtn.getLocation();
		System.out.println(poi.getX());
		System.out.println(poi.getY());
		
		//7. getRect method
		Rectangle rect = loginbtn.getRect();
		System.out.println("Dimension of Loginbtn :" + rect.getDimension());
		System.out.println("Width of Loginbtn :" + rect.getWidth());
		System.out.println("Height of Loginbtn :" + rect.getHeight());
		System.out.println("Location of Loginbtn :" + rect.getPoint());
		System.out.println("Point x of Loginbtn :" + rect.getX());
		System.out.println("Point y  of Loginbtn :" + rect.getY());
		
		//C. Validation Methods
		
//		if(loginbtn.isDisplayed() && loginbtn.isEnabled()) { // 1. isDisplayed method 2. is.Enabled Method
//			loginbtn.submit();
//			
//		}
//		
//		Thread.sleep(3000);
		
		WebElement createnew = driver.findElement(By.partialLinkText("Create"));
		createnew.click();
		
		WebElement maleradio = driver.findElement(By.xpath("//label[text() = 'Male']/input"));
		
		//all validation methods
		if(!maleradio.isSelected() && maleradio.isDisplayed() && maleradio.isEnabled())
		{
			maleradio.click();
			
		}
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
}
