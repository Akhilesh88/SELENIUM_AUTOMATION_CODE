package seleniumtraining;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.navigate().to("https://money.rediff.com/gainers/bsc/daily/groupa?");
		WebElement currentprice=driver.findElement(By.xpath("//table//tbody/tr/td[1]/a[contains(text(),'Cummins India' )]/following::td[3]"));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'",currentprice);
		WebElement prvsprice=driver.findElement(By.xpath("//table//tbody/tr/td[1]/a[contains(text(),'Cummins India' )]/following::td[2] "));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'",prvsprice);
		String cp = currentprice.getText();
		System.out.println(cp);
		  double cprice=Double.parseDouble(cp); 
		  String pp=prvsprice.getText(); 
		  double pprice=Double.parseDouble(pp); 
		System.out.println("Difffernce is =" + (cprice - pprice));
	}
}