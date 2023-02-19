package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTableMoney {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.navigate().to("https://www.moneycontrol.com/stocks/marketstats/onlybuyers.php");
		WebElement Lastprice = driver.findElement(By.xpath("//tbody/tr/td/a[contains(text(),'Construction & Contracting - Real Estate')]/following::td[3]"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", Lastprice);
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", Lastprice);
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", Lastprice);
		WebElement percentchng = driver.findElement(By.xpath("//a[contains(text(),'Soma Textile')]/following::td[5]"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", percentchng);
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", percentchng);
		String lp = Lastprice.getText();
		System.out.println("Last price of Company=" + lp);
		String Perchng = Lastprice.getText();
		System.out.println("% change in price of Company=" + Perchng);
		Thread.sleep(5000);
		driver.close();

	}
}