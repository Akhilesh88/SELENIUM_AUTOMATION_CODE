package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowntest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		Select drpCountry = new Select(driver.findElement(By.name("country")));
	//	jsExecutor.executeScript("arguments[0].scrollIntoView(true);", drpCountry);
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", drpCountry);
		// drpCountry.selectByValue("ARGENTINA ");
		drpCountry.selectByValue("FIJI");
		// driver.get("http://jsbin.com/osebed/2");
		// Select fruitsdrop=new Select(driver.findElement(By.id("fruits")));
		// fruitsdrop.selectByVisibleText("Apple");
		// jsExecutor.executeScript("arguments[0].style.border='2px solid red'",
		// fruitsdrop);
	}
}