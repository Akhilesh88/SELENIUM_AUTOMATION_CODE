package seleniumtraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement googsrch =driver.findElement(By.xpath("//input[@name='q']"));
		googsrch.sendKeys("Github");
		//driver.findElement(By.xpath("//input[contains(@value,'Google Search')]")).click();
		//driver.findElement(By.name("btnK")).click();
		//WebElement search =driver.findElement(By.xpath("//input[contains(@name,'btnK')]"));
		WebElement search =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'btnK')]")));
		search.click();
		//jsExecutor.executeScript("arguments[0].style.border='2px solid red'",search);
		
		/*
		 * //WebDriverManager.edgedriver().setup(); // WebDriver driver = new
		 * EdgeDriver(); driver.manage().window().maximize();
		 * driver.navigate().to("https://trainee-web-app.azurewebsites.net/auth/login");
		 * //driver.findElement(By.
		 * xpath("//input[@class=\"form-control bg_0 ng-untouched ng-pristine ng-invalid\" ]"
		 * )); driver.findElement(By.id("inputUserName")).sendKeys("test@test.com"); //
		 * WebElement
		 * userName=driver.findElement(By.xpath("//*[@id=\"inputUserName\"]"));
		 * //WebElement userName =
		 * driver.findElement(By.xpath("//input[@id=\"inputUserName\"]"));
		 * //userName.sendKeys("test@test.com");
		 * driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("test")
		 * ; // WebElement
		 * sigin=driver.findElement(By.xpath("//button[@type='submit']")); WebElement
		 * sigin=driver.findElement(By.xpath("//button[contains(text(),'SIGN')]"));
		 * sigin.click(); Thread.sleep(4000); WebElement open =
		 * driver.findElement(By.xpath("//a[@class='btn btn-primary card-btn']"));
		 * open.click(); // WebElement opendetail=driver.findElement(By.
		 * xpath("//*[contains(@class,'btn btn-primary card-btn')]")); //
		 * opendetail.click(); ///JavascriptExecutor jsExecutor = (JavascriptExecutor)
		 * driver;
		 * //jsExecutor.executeScript("arguments[0].style.border='2px solid red'",
		 * userName); //driver.findElement(By.
		 * xpath("//input[@class=\"form-control bg_0 ng-dirty ng-touched ng-invalid\"]")
		 * ).sendKeys("test@test.com");
		 */
		
	}
}
