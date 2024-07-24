package selenium;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Day4_Navigation_Swithing_Tab {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
//	
//	driver.navigate().to("https://www.google.com/");
//	driver.navigate().back();
//	
//	driver.navigate().refresh();
//	
//	driver.navigate().forward();
	
	//Opening new page
	driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
	
	//Storing the window id in form of set
	Set<String> WindowIds = driver.getWindowHandles();
	
	//To perform function converting set into list
	List<String>WindowList = new ArrayList(WindowIds);
	
	//Getting id of all tabs
	String HomePage = WindowList.get(0);
	String Second_page = WindowList.get(1);
	
	//Switching tab 
	driver.switchTo().window(HomePage);	
	
	//Getting tittle of the new page
	System.out.println(driver.getTitle());
}
}
