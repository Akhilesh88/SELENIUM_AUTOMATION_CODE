package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/write-xpath-table.html");
		WebElement Cell1 = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]"));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", Cell1);
		String text1=Cell1.getText();
		System.out.println("String output of Cell"+text1);
	}
}