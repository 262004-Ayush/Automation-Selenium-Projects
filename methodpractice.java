import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodpractice {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
	
	WebDriver driver = new ChromeDriver();
	
    //Normal Methods of webdriver interface 
	//driver.get("https://www.youtube.com/");
	//String title = driver.getTitle();
	//System.out.println(title);
	//String URl = driver.getCurrentUrl();
	//System.out.println(URl);
	//String pageres = driver.getPageSource();
	//System.out.println(pageres);
	
	
	//manage methods 
    //Window man = driver.manage().window();
	//man.fullscreen();
	//Thread.sleep(4000);
	//driver.manage().window().minimize();
	//Thread.sleep(4000);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	/*
	Dimension dim = new Dimension(700,800);
	man.setSize(dim);
	
	Dimension ref = driver.manage().window().getSize();
	System.out.println(ref.getWidth());
	System.out.println(ref.getHeight());
	
	Point poin = new Point(150,250);
	driver.manage().window().setPosition(poin);
	
	Point po = driver.manage().window().getPosition();
	System.out.println(po.getX());
	System.out.println(po.getY());
	
	
	*/
	// set size 
	Dimension dim = new Dimension(1000,1200);
	driver.manage().window().setSize(dim);
	// get size
	Dimension ref = driver.manage().window().getSize();
	System.out.println(ref.getWidth());
	System.out.println(ref.getHeight());
	
	//set position
	Point poi = new Point(150,200);
	driver.manage().window().setPosition(poi);
	
	//get position
	Point points = driver.manage().window().getPosition();	
	System.out.println(points.getX());
	System.out.println(points.getY());
	
	
	
	
	
	
	
	
	
	Thread.sleep(3000);
	
	
/*	
	
	
	Navigation nav = driver.navigate();
	
	//1. to(String URl);
	String URL1 = "https://www.facebook.com/";
	nav.to(URL1);
	Thread.sleep(5000);
	
	//2. to(new URl("url");

	URL url2 = new URL("https://www.flipkart.com/");
    nav.to(url2);	
    Thread.sleep(3000);
    
    
	// for getting details..
	String title = driver.getTitle();
	System.out.println(title);
	String URl = driver.getCurrentUrl();
	System.out.println(URl);
	
	
	// Next is Navigate it has return type Navigation
	nav.back();
	
	Thread.sleep(3000);
	
	nav.forward();
	
	Thread.sleep(3000);
	
	nav.refresh();
	
	Thread.sleep(3000);
	*/
	//driver.close();
	driver.quit();
	
	
}
}