package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googleassign {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/ ");
		WebElement SearchBox = driver.findElement(By.xpath("//div/input[@class='gLFyf gsfi']"));
		SearchBox.sendKeys("Flower");
		WebElement googsrchbtn=driver.findElement(By.xpath(""));
	}

}
