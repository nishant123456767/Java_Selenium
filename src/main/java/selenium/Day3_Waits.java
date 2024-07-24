package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day3_Waits {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	
	WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(2));
	
	//Adding wait method 
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	//Explict wait
	WebElement txtuser =  mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")));
	txtuser.sendKeys("Admin");
	
	WebElement log_button = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")));
	log_button.click();
	//Thread.sleep(2000);//used for waiting for particular time
	//Entering username
	//driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("admin");
	



}
}
