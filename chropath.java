package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chropath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/login.html");
		// driver.findElement(By.xpath("//*[contains(@id,'email')]"));
		// driver.findElement(By.xpath("//*[contains(@name,'email')]"));
		// driver.findElement(By.xpath("//*[contains(@data-validate,'isEmail')]")).sendKeys("Admin");
		// driver.findElement(By.xpath("//input[@id='email'or
		// @type='text']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[starts-with(@id,'email')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='passwd'and @name='passwd']")).sendKeys("Admin123");

		Thread.sleep(3000);
		driver.quit();
	}

}
