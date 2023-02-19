package seleniumtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivertest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\akhilesh.behera\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\4.1.1\\selenium-chrome-driver-4.1.1.exe");
		WebDriver c = new ChromeDriver();
		//ChromeDriver ctr = new ChromeDriver();
		c.manage().window().maximize();
		c.navigate().to("https://www.google.co.in/");
	}

}
