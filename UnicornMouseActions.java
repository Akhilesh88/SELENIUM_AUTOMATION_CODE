package assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
public class UnicornMouseActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://trainee-web-app.azurewebsites.net/auth/login");
		WebElement InputUserName1 = driver.findElement(By.xpath("//input[@id='inputUserName']"));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", InputUserName1);
		 
		Actions builder = new Actions(driver);
		Action SeriesOfKeyboardActions = builder
		.moveToElement(InputUserName1)
		.click()
		.keyDown(InputUserName1, Keys.SHIFT)
		.sendKeys(InputUserName1, "test@test")
		.keyUp(InputUserName1, Keys.SHIFT)
		.doubleClick(InputUserName1)
		.contextClick()
		.build();
		SeriesOfKeyboardActions.perform();
		}

}
