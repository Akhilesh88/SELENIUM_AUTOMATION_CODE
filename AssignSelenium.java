//Please write automation scripts for below URL 
//https://chandanachaitanya.github.io/selenium-practice-site/

package assignment;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignSelenium {

	public static void main(String[] args) throws InterruptedException {
		String baseURL = "https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get(baseURL);
		// driver.navigate().to("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		WebElement check = driver.findElement(By.xpath("//input[@id='bicycle-checkbox']"));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", check); // 1) To click checkbox;
		check.click();
		driver.findElement(By.xpath("//input[contains(@value,'Magazines')]")).click();
		Select droplanguage = new Select(driver.findElement(By.name("languages")));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", droplanguage);// 2) Select value from
		droplanguage.selectByValue("Python");// dropdown
		Thread.sleep(3000);
		Select dropSeleniumtoolsuite = new Select(driver.findElement(By.name("selenium_suite")));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", dropSeleniumtoolsuite);
		dropSeleniumtoolsuite.selectByVisibleText("Advantages");
		Thread.sleep(3000);
		WebElement msgpassbox = driver.findElement(By.xpath("//input[@id='enterText']"));
		msgpassbox.sendKeys("!!!!!!WelcomeTo Selenium Git Demo Website!!!!!");
		Thread.sleep(3000);
		String MainWindowHandle = "";
		MainWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window handle" + MainWindowHandle);
		WebElement NewWin = driver.findElement(By.xpath("//*[@id=\"win1\"]")); // Clicking on The New window&it opens
																				// successfully;
		NewWin.click();
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> i1 = windowhandles.iterator();
		while (i1.hasNext()) {
			String Childwindow = i1.next();
			if (!MainWindowHandle.equalsIgnoreCase(Childwindow)) {
				driver.switchTo().window(Childwindow);
				WebElement googsrch = driver.findElement(By.xpath("//input[@name='q']"));
				googsrch.sendKeys("Github ");
				//driver.findElement(By.xpath("//input[contains(@value,'Google Search')]")).click();
				//driver.findElement(By.name("btnK")).click();
				WebElement search = driver.findElement(By.xpath("//input[@name='btnK']"));
				search.click();
				jsExecutor.executeScript("arguments[0].style.border='2px solid red'",search);
				
			}
		}

		// driver.close();
		// driver.navigate().to(" ");
		// driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		// driver.navigate().back();
		Thread.sleep(3000);
		driver.quit();
	}
}