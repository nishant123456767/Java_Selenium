package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Css_Selecctor_maual {

	public static void main(String[] args) {
		//Getting the chrome driver to get the features relate to the video
		WebDriver driver = new ChromeDriver();
		
		//Getting the link of the website
		driver.get("https://demo.nopcommerce.com/");
		
		//Maximize the window to get full screen
		driver.manage().window().maximize();
		
		//Using the css slector #id to perfrom function
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Mobile");
		
		//Using tag.class for css selector
		driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("Mobile phones");
		
		//tag attribute for css selector
		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Hello world");
		
		//tag.class attribute for css selector
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Hello world");
		
		
		//Xpath
		//Relative xpath
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Tshrit");
		
		//asbsolute xpath
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[2]/form[1]/input[1]")).sendKeys("Hello world");
		
		//xpath using multiple attributes
		driver.findElement(By.xpath("//input[@id='small-searchterms'][@name='q']")).sendKeys("Hello world");
		
		//Using and ,or operator to find xpath
		driver.findElement(By.xpath("//input[@id='small-searchterms'and @name='q']")).sendKeys("Nishant");
		
		//Using or operator
		driver.findElement(By.xpath("//input[@id='small-searchterms' or @name='abcd']")).sendKeys("Nishant");
		
		
		
		
		
		String tittle = driver.getTitle();
		System.out.println(tittle);
		
	}
}
