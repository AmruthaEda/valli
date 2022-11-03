package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/Amrutha/eclipse-workspace/Amrutha_automation2/Drivers/Chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("user132@qwe.com");
		driver.findElement(By.id("pass")).sendKeys("Password123");
		driver.findElement(By.name("login")).click();
		 
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("window.scrollBy(0,1000)");
		System.out.println("Title of this page"+driver.getTitle()); 
		

	}

}
