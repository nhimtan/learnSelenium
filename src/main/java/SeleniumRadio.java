import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumRadio {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement radioEle = driver.findElement(By.id("vfb-7-1"));
		
		if(!radioEle.isSelected()) {
			radioEle.click();
		}
		

	}

}
