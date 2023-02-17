package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement( By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.getTitle();
		driver.findElement(By.className("Create Lead")).click();
		
		 WebElement leadbutton = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 
		 Select op = new Select(leadbutton);
		 
		 op.selectByIndex(0);
		 op.selectByValue("LEAD_WEBSITE");
		 op.deselectByVisibleText("Existing Customer");
		 driver.close();
	}

}
