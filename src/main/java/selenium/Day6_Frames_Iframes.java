package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_Frames_Iframes {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();
	
	//Search element by frames	
	WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(frame1);
	
	driver.findElement(By.name("mytext1")).sendKeys("Welcome");
	
	driver.switchTo().defaultContent();
	
	WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	driver.switchTo().frame(frame2);
	
	driver.findElement(By.name("mytext2")).sendKeys("Welcome");
	
	driver.switchTo().defaultContent();
	WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	
	
	driver.switchTo().frame(frame3);
	
	driver.findElement(By.name("mytext3")).sendKeys("Welcome");

	driver.switchTo().frame(0);
	
	driver.findElement(By.xpath("//div[@id='i5']//div[@class='AB7Lab Id5V1']")).click();

	


}
}
