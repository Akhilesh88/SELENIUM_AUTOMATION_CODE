package seleniumtraining;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTableTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.guru99.com/test/web-table-element.php");
		List<String> HeaderList = new ArrayList<String>();
		List<WebElement> HeaderElements = driver.findElements(By.xpath("//thead/tr/th"));
		if (HeaderElements.size() != 0) {
			System.out.println("Header size" + HeaderElements.size());
			for (int i = 0; i < HeaderElements.size(); i++) {
				System.out.println(HeaderElements.get(i).getText());
				System.out.println(HeaderList.get(i));
			}
		} /*
			 * else { System.out.println("List Is Empty "); }
			 */
List<WebElement> rowlist =driver.findElements(By.xpath("//table/tbody/tr"));

	}
}