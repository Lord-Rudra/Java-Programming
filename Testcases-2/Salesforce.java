package Testcases;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class Salesforce {
	public static void main(String[] args) {
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--disable-notifications");
		EdgeDriver browser = new EdgeDriver(options);
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		browser.get("https://login.salesforce.com/");
		browser.findElement(By.xpath("//form[@name='login']//input[@name ='username']")).sendKeys("hari.radhakrishnan@qeagle.com" );
		browser.findElement(By.xpath("//form[@name='login']//input[@id ='password']")).sendKeys("Leaf@123");
		browser.findElement(By.xpath("//input[@id='Login']")).click();
		String windowMain = browser.getWindowHandle();
		browser.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> allWindows = browser.getWindowHandles();
		List <String> newWindow = new ArrayList(allWindows);
		browser.switchTo().window( newWindow.get(1));
		browser.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow shade = new Shadow (browser);
		shade.findElementByXPath("//span[text()='Learning']").click();
		Actions actions = new Actions(browser);
		WebElement shadow2 = shade.findElementByXPath("//span[text()='Learning on Trailhead']");
		actions.moveToElement(shadow2).click().perform();
		browser.findElement(By.id("certification-btn")).click();
		browser.findElement(By.xpath("//a[text()='Administrator']")).click();
		String currentUrl = browser.getCurrentUrl();
		System.out.println(currentUrl);
		List<WebElement> browserElement = browser.findElements(By.className("credentials-card_title"));

		for(WebElement element : browserElement){
			System.out.println(element.getText());
		}


	}

}
