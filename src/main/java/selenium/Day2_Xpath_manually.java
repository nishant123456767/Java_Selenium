package selenium;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Xpath_manually {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		
		//Get method used for functionailty of the page
		//This method will get the tittle of the page
		//System.out.println(driver.getTitle());
		
		//This method will get source of the page
		//System.out.println(driver.getPageSource());
		
		//This method will return current url of the page on which we are working 
		//System.out.println(driver.getCurrentUrl());
		
		//This method will get you the current tab id on which we are working
		//System.out.println(driver.getWindowHandles());
		
		//driver.close();
		
		//Conditional method
		//Is displayed will check if that particular element is displayed or not
		//driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		//WebElement log = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		//System.out.println("Status Logo "+log.isDisplayed());
		
		//Is Enabled
		//System.out.println(driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled());
		
		//Is Selected
		//System.out.println(driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected());
		
		
		//Assignment
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Entering name
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Nishant");
		
		//Entering email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Nishant@gmail.com");
		
		//Entering Phone number
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234567895");
		
		//Entering Address
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("xyz");
		
		//Selecting gender
		driver.findElement(By.xpath("//input[@id='male']")).click();
		
		//Selecting Day
		driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		
		//Printing gender of user
		if(driver.findElement(By.xpath("//input[@id='male']")).isEnabled() == true) {
			System.out.println("Gender is male");
		}
		else {
			System.out.println("Gender is Female");
		}

		//Checking gender heading is present or not
		if (driver.findElement(By.xpath("//label[contains(text(),'Gender:')]")).isDisplayed() == true) {
			System.out.println("Heading is present");
		}
		else {
			System.out.println("heading is not present");
		}
		
		//Checking day selected
		if (driver.findElement(By.xpath("//input[@id='sunday']")).isSelected() == true) {
			System.out.println("Sunday");
		}
		else if(driver.findElement(By.xpath("//input[@id='monday']")).isSelected() == true) {
			System.out.println("Monday");
		}
		else if(driver.findElement(By.xpath("//input[@id='tuesday']")).isSelected() == true) {
			System.out.println("Tuesday");
		}
		else if(driver.findElement(By.xpath("//input[@id='wednesday']")).isSelected() == true) {
			System.out.println("Wednesday");
		}
		else if(driver.findElement(By.xpath("//input[@id='thrusday']")).isSelected() == true) {
			System.out.println("Thrusday");
		}
		else if(driver.findElement(By.xpath("//input[@id='friday']")).isSelected() == true) {
			System.out.println("Friday");
		}
		else if(driver.findElement(By.xpath("//input[@id='saturday']")).isSelected() == true) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("No day selected");
		}
	}
}
