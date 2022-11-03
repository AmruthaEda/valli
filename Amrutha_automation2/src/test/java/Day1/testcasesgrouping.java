package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testcasesgrouping {
	@Test(dataProvider="automationdata")  

	public void loginintofacebook(String username , String password) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/Amrutha/eclipse-workspace/amrutha_automation/Drivers/Chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(username); 
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[3]/button")).click();
		Thread.sleep(500);
		driver.quit();
	
}
	
@DataProvider(name="automationdata")
public Object[][] passData()
{
	Object [][] data=new Object[3][2];
	
	data [0][0]="amrutha";
	data [0][1]="123456";
	
	data[1][0]="valli";
	data[1][1]="14568";
	
	data[2][0]="ammuaaa";
	data[2][1]="456305";
	return data;
 
	
	
	
}
}


