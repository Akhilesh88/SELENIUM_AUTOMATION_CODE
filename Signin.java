package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.navigate().to("https://trainee-web-app.azurewebsites.net/auth/login");
		
		WebElement uesrna =driver.findElement(By.xpath("//input[@id='inputUserName']"));
		uesrna.sendKeys("test@test.com");
		//jsExecutor.executeScript("arguments[0].style.border='2px solid red'", usename);
		WebElement Pass =driver.findElement(By.xpath("//input[@id='inputPassword']"));
		Pass.sendKeys("test");
		//jsExecutor.executeScript("arguments[0].style.border='2px solid red'",  Pass);
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		//click();
	}

}
