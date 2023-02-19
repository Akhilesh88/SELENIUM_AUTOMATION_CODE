package seleniumtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class firefoGoogle {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");
		// driver.findElement(By.id("inputUserName")).sendKeys("test@test.com");
		// System.out.println("");
		// driver.quit();
	}
}
