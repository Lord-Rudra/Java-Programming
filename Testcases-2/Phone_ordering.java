package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class Phone_ordering {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ch.addArguments("--remote-allow-origins=*");
		ChromeDriver browser = new ChromeDriver(ch);
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		browser.get("https://dev57841.service-now.com/");
		browser.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		browser.findElement(By.xpath("//input[@name='user_password']")).sendKeys("Srivatsan@12");
		browser.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		Shadow shade = new Shadow(browser);
		shade.setImplicitWait(30);
		shade.findElementByXPath("//div[text()='All']").click();
		shade.setImplicitWait(5);
		shade.findElementByXPath("//input[@id='filter']").sendKeys("Service");
		shade.findElementByXPath("//span [text()=' Catalog']").click();
		WebElement element = shade.findElementByXPath("//iframe[@id='gsft_main']"); // xpath for the frame main
		browser.switchTo().frame(element);
		browser.findElement(By.xpath("//table//a[text()='Mobiles']")).click();
		browser.switchTo().defaultContent();
		Thread.sleep(5000);
		WebElement element2 = shade.findElementByXPath("//iframe[@id='gsft_main']");
		browser.switchTo().frame(element2);
		browser.findElement(By.xpath("//a[@id='item_link_ec80c13297968d1021983d1e6253af32']")).click();
		browser.switchTo().defaultContent();
		Thread.sleep(5000);
		WebElement element3 = shade.findElementByXPath("//iframe[@id='gsft_main']");
		browser.switchTo().frame(element3);
	    browser.findElement(By.xpath("//span//label[text()='No']")).click();
	    Select dropdown = new Select(browser.findElement(By.xpath("//div[@class='row sc-row']//select")));
	    dropdown.selectByIndex(1);
	    browser.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
	    WebElement order = browser.findElement(By.xpath("//div[@id='sc_order_status_intro_text']"));
	    System.out.println(order.getText());
	    
		
		
//
	}
}
