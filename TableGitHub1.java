package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableGitHub1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.navigate().to("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		WebElement Row1 = driver.findElement(By.xpath("//*[@id=\"tables\"]/div/table/tbody/tr[1]/td[1]")); // For accessing the table using // tag name
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'",Row1);
		WebElement Row2 = driver.findElement(By.xpath("//td[contains(text(),'Selenium') ] "));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'",Row2 );
		WebElement Row5 = driver.findElement(By.xpath("//td[contains(text(),'Fantastic Beasts and Where to Find Them') ] "));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'",Row5 );
		String Value1=Row1.getText();
		String Value2=Row2.getText();
		String Value52=Row5.getText();
		System.out.println("String output of Cell ="+Value1);
		System.out.println("Output text of third Cell is = "+Value2);
		System.out.println("Output text of third Cell is = "+Value52);
	}
}