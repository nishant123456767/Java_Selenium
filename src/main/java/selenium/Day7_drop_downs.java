package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day7_drop_downs {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	WebElement dropCountry = driver.findElement(By.xpath("//select[@id='country']"));
	Select drpcon = new Select(dropCountry);
	
	//drpcon.selectByIndex(1);
	//drpcon.selectByVisibleText("Japan");
	drpcon.selectByValue("japan");
	
	List<WebElement>options = drpcon.getOptions();
	System.out.println("No of elements = "+ options.size());
	
	for (int i =0; i<options.size();i++) {
		System.out.println(options.get(i).getText());
	}
}
}
