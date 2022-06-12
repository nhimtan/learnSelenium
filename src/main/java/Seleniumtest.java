import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumtest {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		String url = "https://demo.guru99.com/test/newtours/";
		driver.get(url);
		
		//navigate sang 1 url khac
		//driver.navigate().to("https://www.google.com/");
		
		//get title
		//System.out.println(driver.getTitle());
		
		//get pageSource
		//System.out.println(driver.getPageSource());
		
		// forward by one page on the browser's history
		//driver.navigate().forward();
		
		//back by one page on the browser's history
		//driver.navigate().back();
		
		//the same function as pressing F5
		//driver.navigate().refresh();
		
		//WebElement userName = driver.findElement(By.name("userName"));
//		if(userName.isDisplayed()) {
//			userName.click();
//			userName.sendKeys("abc");
//			userName.clear();
//			userName.sendKeys("tandt");
//		}else {
//			System.out.println("username is not displayed");
//		}
//		
//		try {
//			driver.manage().timeouts().wait(10000);
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		//isEnabled command
//		if(userName.isEnabled()) {
//			userName.sendKeys("Tandt");
//		}else {
//			System.out.println("username is not isenabled");
//		}
		//driver.findElement(By.name("submit")).submit();
		
			
//		String siteNameValue = driver.findElement(By.id("site-name")).getText();
//		System.out.println(siteNameValue);
//		System.out.println(driver.getCurrentUrl());
		
		//String siteNameValue = driver.findElement(By.id("site-name")).getCssValue("background-color");
		String siteNameValue = driver.findElement(By.id("site-name")).getAttribute("name");
		System.out.println(siteNameValue);
		
		WebElement element= driver.findElement(By.id("site-name"));
		org.openqa.selenium.Dimension dimen=element.getSize();
		System.out.println("height: "+ dimen.height + " Width: " + dimen.width);
		
		Point point = element.getLocation();
		System.out.println("Point x: " + point.x + " Point y: " + point.y);
		
		driver.quit();

	}

}
