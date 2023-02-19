package assignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/droppable/");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions builder = new Actions(driver);
		WebElement Dragga =driver.findElement(By.id("draggable"));
		//WebElement Dragga =driver.findElement(By.xpath("//body/div[contains(@id,'draggable')]"));
		//WebElement Dragga=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[contains(@id,'draggable')]")));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'",Dragga);
		WebElement Dropa =driver.findElement(By.id("droppable"));
		//WebElement Dropa =driver.findElement(By.xpath("//body/div[contains(@id,'droppable')]"));
		//WebElement Dropa=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[contains(@id,'droppable')]")));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'",Dropa);
		
		 
		WebElement to = driver.findElement(By.id("droppable"));	 
		//Perform drag and drop
		builder.dragAndDrop(Dragga, Dropa).perform();
		
		//verify text changed in to 'Drop here' box 
		String textTo = to.getText();

		if(textTo.equals("Dropped!")) {
			System.out.println("PASS: Source is dropped to target as expected");
		}else {
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}
	
		driver.close();

	}
}