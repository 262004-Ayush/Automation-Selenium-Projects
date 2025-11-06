import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class signupFacebook {
   public static void main(String[] args) throws InterruptedException {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	
	   Thread.sleep(2000);
	   
	   WebElement createnew = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
	   createnew.click();
	   Thread.sleep(2000);
	   
	   WebElement firstname = driver.findElement(By.xpath("//input[@name = 'firstname']"));
	   firstname.sendKeys("Ayush");
	   Thread.sleep(2000);
	   
	   WebElement lastname = driver.findElement(By.xpath("//input[@name = 'lastname']"));
	   lastname.sendKeys("Rawat");
	   Thread.sleep(2000);
	   
	   WebElement date = driver.findElement(By.xpath("//option[text() = '26']"));
	   date.click();
	   Thread.sleep(2000);
	   
	   WebElement month = driver.findElement(By.xpath("//option[text() = 'Apr']"));
	   month.click();
	   Thread.sleep(2000);
	   

	   WebElement year = driver.findElement(By.xpath("//option[text() = '2004']"));
	   year.click();
	   Thread.sleep(2000);
	   
	   WebElement male = driver.findElement(By.xpath("//label[text() = 'Male']/..//input"));
	   male.click();
	   Thread.sleep(2000);
	   
	   WebElement email = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
	   email.sendKeys("ayushrawat551542@gmail.com");
	   Thread.sleep(3000);
	   
	   WebElement password = driver.findElement(By.xpath("//input[@id = 'password_step_input']"));
	   password.sendKeys("Ayush@2255335026");
	   Thread.sleep(3000);
	   
	   WebElement signup = driver.findElement(By.xpath("//button[text() = 'Sign Up']"));
	   signup.click();
	   

	   Thread.sleep(15000);
	   
	   driver.navigate().back();
	   
	   
	   Thread.sleep(5000);
	   driver.quit();
	   
		}
	

}

