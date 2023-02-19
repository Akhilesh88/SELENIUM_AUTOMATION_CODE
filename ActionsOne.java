package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsOne {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/tool-tips");
		
		WebElement tooltipview = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", tooltipview);
		String tooltiview = tooltipview.getText();
		System.out.println("Message that is displayed on hovering=" + tooltiview);
		WebElement tooltext2 = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", tooltext2);
		String tooltextView = tooltext2.getText();
		System.out.println("Message that is displayed on text box =" + tooltextView);

	}
}
