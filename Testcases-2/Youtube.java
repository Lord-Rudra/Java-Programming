package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Youtube {
	public static void main(String[] args) {
		
		EdgeDriver tube = new EdgeDriver();
		tube.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		tube.get("https://www.youtube.com/");
		tube.manage().window().maximize();
		tube.findElement(By.xpath("//button[@aria-label='Dismiss']")).click();
		tube.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		tube.findElement(By.xpath("//input [@id='search']")).sendKeys("pothuvaga en manasu");
		tube.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		tube.findElement(By.xpath("//div//a[@id='video-title' and contains(@aria-label,'AP ') ][1]")).click();
		tube.findElement(By.xpath("//button[@title='Full screen (f)']")).click();
		tube.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		tube.findElement(By.xpath("//div[text()='Skip Ads']")).click();
		tube.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		
	
	}

}
