package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.guru99.com/test/radio.html");
		// WebElement
		// radio=driver.findElement(By.xpath("//input[contains(@value,'1')]"));
		// jsExecutor.executeScript("arguments[0].style.border='2px solid red'", radio);
		// radio.click();
		WebElement chxbox = driver.findElement(By.xpath("//input[contains(@value,'checkbox1')]"));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", chxbox);
		chxbox.click();
	}

}
