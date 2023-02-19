package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableAssign {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/write-xpath-table.html");
		WebElement Cell1 = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]"));   // For accessing the table using tag name
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", Cell1);
		WebElement Cell3=driver.findElement(By.xpath("//td[contains(text(),'third cell') ] "));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", Cell3);
		String char3=Cell3.getText();
		String char1 = Cell1.getText();
		System.out.println("String output of Cell =" + char1);
		System.out.println("Output text of third Cell is = "+char3);
	}
}