//1)	Use different Xpath axes methods – Following , Ancestor, child, Preceding, Following-sibling, Parent, Self, Descendant.
package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class axesmthd {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/login.html");
		// driver.findElement(By.xpath("//*[@type='text']//following::input]"));
		// WebElement axsdriver=driver.findElement(By.xpath("//*[@type='text']//following::input"));
		// WebElement axsdriver=driver.findElement(By.xpath("//*[@type='text']//ancestor::div"));
	//	 WebElement axsdriver=driver.findElement(By.xpath("//*[@type='text']//child::div"));
		//WebElement axsdriver=driver.findElement(By.xpath("//*[@type='submit']//preceding::input"));
		WebElement axsdriver=driver.findElement(By.xpath("//*[@type='submit']//parent::type"));
		//WebElement axsdriver=driver.findElement(By.xpath("//*[@type='submit']//child::lib"));
		//axsdriver.sendKeys("admin");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", axsdriver);
		//driver.quit();
	}
}