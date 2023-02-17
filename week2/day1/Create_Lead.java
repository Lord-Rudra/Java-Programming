package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Lead {
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver edge = new EdgeDriver();
		
		edge.get("http://leaftaps.com/opentaps/control/login");
		edge.manage().window().maximize();
		
		edge.findElement(By.id("username")).sendKeys("demosalesmanager");
		edge.findElement(By.id("password")).sendKeys("crmsfa");
		edge.findElement(By.className("decorativeSubmit")).click();
		edge.findElement(By.linkText("CRM/SFA")).click();
		edge.findElement(By.linkText("Create Lead")).click();
		edge.findElement(By.id("createLeadForm_companyName")).sendKeys("Raatha Bhoomi");
		edge.findElement(By.id("createLeadForm_firstName")).sendKeys("Kai");
		edge.findElement(By.id("createLeadForm_lastName")).sendKeys("Pulley");
		edge.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Thalai");
		edge.findElement(By.id("createLeadForm_departmentName")).sendKeys("Varutham illa Valibar Sangam");
		edge.findElement(By.id("createLeadForm_description")).sendKeys(" Enna thambi ennaaa aacchu ");
		edge.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kaipulley@rathabhoom.com");
		WebElement dropDown = edge.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		dropDown.click();
		Select state = new Select(dropDown);
		state.selectByVisibleText("New York");
		edge.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		String title = edge.getTitle();
		System.out.println(title);
		edge.close();
		
	}
}
