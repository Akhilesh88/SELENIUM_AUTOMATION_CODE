package seleniumtraining;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionTest1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/newtours/");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		WebElement cell1 = driver.findElement(By.xpath("(//tr[@class='mouseOut']/td[1])[1]"));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", cell1);
		 Actions builder = new Actions(driver);
         Action KeyboardOperation1=builder.moveToElement(cell1).build();
         KeyboardOperation1.perform();
         Action KeyboardOperation2 =builder.doubleClick(cell1).build();
         KeyboardOperation2.perform();
          
	}
}