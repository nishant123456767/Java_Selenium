package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_Handling_Check_Boxes_Different_Types_Alerts  {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
//	driver.get("https://testautomationpractice.blogspot.com/");
//	driver.manage().window().maximize();
//	
//	List<WebElement> checkboxes =  driver.findElements(By.xpath("//input[@class='form-check-input' and @type=\"checkbox\"]"));
//
//	for (int i = 0; i < checkboxes.size(); i++) {
//		checkboxes.get(i).click();
//	}

	//Alerts/Popups
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	
//	driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
//	
//	//acccet
//	Alert myalert = driver.switchTo().alert();
//	System.out.println(myalert.getText());
//	myalert.accept();
//	
//	//Dismiss 
//	driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
//	driver.switchTo().alert().dismiss();
//	
	//
	driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
	Alert myalert =  driver.switchTo().alert();
	
	myalert.sendKeys("Welcome");
	myalert.accept();

}

}
