package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass_Salesforce { // BASE ClASS for the Salesforce_architect method and Salesforcetestcase.xml 
	public EdgeDriver browser = new EdgeDriver();
	@BeforeTest
	
	public void baseclass() {
	browser.manage().window().maximize();
	browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	browser.get("https://login.salesforce.com/");
	browser.findElement(By.xpath("//form[@name='login']//input[@name ='username']")).sendKeys("hari.radhakrishnan@qeagle.com" );
	browser.findElement(By.xpath("//form[@name='login']//input[@id ='password']")).sendKeys("Leaf@123");
	browser.findElement(By.xpath("//input[@id='Login']")).click();

	}
	

}
