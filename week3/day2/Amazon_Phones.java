package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v106.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_Phones {
	
	

	public static void main(String[] args) {
		
		EdgeDriver browser = new EdgeDriver();
		browser.get("https://www.amazon.in/");
        browser.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones",Keys.ENTER);
        
		
	}
}
