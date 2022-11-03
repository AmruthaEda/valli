package Day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testng {
@Test 
public void test1()
{
	System.out.println("first case");
	}
@Test
public void test2()
{
	System.out.println("this is second case");
}
@BeforeMethod
public void beforemethod()
{
	System.out.println("this is beforemethod");
}
@AfterMethod
public void aftermethod()
{
	System.out.println("this is after method");
}
@BeforeClass
public void beforeclass()
{
	System.out.println("this is before class"); 
}
@AfterClass
public void afterclass()
{
	System.out.println("this is after class");
}
@BeforeSuite
public void beforesuite()
{
	System.out.println("this is before suite");
}
@AfterSuite
public void aftersuite()
{
	System.out.println("this is after suite");
}

}
 