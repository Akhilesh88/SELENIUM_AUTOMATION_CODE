package seleniumtraining;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.guru99.com/popup.php");
		String Mainwindowhandle = "";

		Mainwindowhandle = driver.getWindowHandle();
		System.out.println("PArent Window handle "+Mainwindowhandle);
		WebElement win1 = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		win1.click();
		Set<String> WindowHandles = driver.getWindowHandles();
		Iterator<String> i1 = WindowHandles.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!Mainwindowhandle.equalsIgnoreCase(ChildWindow)) {

				// Switching to Child window
				driver.switchTo().window(ChildWindow);
				System.out.println(ChildWindow );
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Zara3n@gmail.com");

				driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

				// Closing the Child Window.
				driver.close();
			}
		}

	}

}
