package Testcases;


import io.github.sukgu.Shadow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Salesforce_architect extends Baseclass_Salesforce {
	@Test
	public void executeClass() {
		browser.findElement(By.xpath("//button[@title='Learn More']")).click();
		for(String newWindow : browser.getWindowHandles()){
			browser.switchTo().window(newWindow);}
		browser.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow element = new Shadow(browser); 
		element.findElementByXPath("//span[text()='Learning']").click();
		Actions mouse = new Actions(browser);
		element.findElementByXPath("//span[text()='Learning on Trailhead']").click();
		browser.findElement(By.id("certification-btn")).click();
		WebElement mouseOver = browser.findElement(By.xpath("//div[text()='Architect']"));
		mouse.click(mouseOver).perform();
		List<WebElement> certifications = browser.findElements(By.className("credentials-card "));
		for (WebElement architect : certifications) {
			System.out.println(architect.getText());}
	
	}

}

