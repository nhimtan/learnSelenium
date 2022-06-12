import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumCheckBox {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		String url = "https://demo.guru99.com/test/radio.html";
		driver.get(url);
		
		//isSelected and click
		WebElement checkbox = driver.findElement(By.id("vfb-6-0"));
//		if(!checkbox.isSelected()) {
//			checkbox.click();
//		}
//		
//		if(checkbox.isDisplayed()) {
//			checkbox.click();
//		}
		
		if(checkbox.isEnabled()) {
			checkbox.click();
		}
		
		
		driver.quit();

	}

}
