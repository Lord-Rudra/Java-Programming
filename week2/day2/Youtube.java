package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Youtube {
	public static void main(String[] args) {
		
		EdgeDriver tube = new EdgeDriver();
		
		tube.get("https://www.youtube.com/");
		tube.manage().window().maximize();
		
		tube.findElement(By.className("ytd-searchbox")).sendKeys("pothuvaga en manasu");
		tube.findElement(By.id("search-icon-legacy")).click();
		
		
		
		
		
	}//*[@id="c"]

}
