package assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLogin {
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		Thread.sleep(3000);		
		WebElement search =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'nav-link-accountList-nav-line-1')]")));
		WebElement sig = driver.findElement(By.xpath("//*[contains(@id,'nav-link-accountList-nav-line-1')]"));
		search.click();
		WebElement apeml = driver.findElement(By.xpath("//*[contains(@id,'ap_email')]"));
		apeml.sendKeys("");//id of amazon
		WebElement signcontinue = driver.findElement(By.xpath("//*[contains(@id,'continue')]"));
		signcontinue.click();
		Thread.sleep(3000);
		WebElement appw = driver.findElement(By.xpath("//*[contains(@id,'ap_password')]"));
		appw.sendKeys("");//Pwd of yrs
		WebElement signclick = driver.findElement(By.xpath("//*[contains(@id,'signInSubmit')]"));
		signclick.click();
		WebElement searchbx = driver.findElement(By.xpath("//*[contains(@id,'twotabsearchtextbox')]"));
		searchbx.sendKeys("oneplus nord 2");
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'",searchbx );
		WebElement searchbxclick = driver.findElement(By.xpath("//*[contains(@id,'nav-search-submit-button')]"));
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'",searchbxclick);
		searchbxclick.click();
		String MainWindowhandle;
		MainWindowhandle =driver.getWindowHandle();
		System.out.println("These is main window haandle ");
		WebElement itemselect= driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
		itemselect.click();
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'",itemselect );
		Set<String> windowhandles=driver.getWindowHandles();
		Iterator<String> i1=windowhandles.iterator();
		while(i1.hasNext()) {
			String childwindow=i1.next();
			if(!MainWindowhandle.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				System.out.println("This is child Window");
				WebElement addcartfun= driver.findElement(By.xpath("//span[contains(@class,'a-button a-spacing-small a-button-primary a-button-icon buybox-button-enhancement-size')]"));
				addcartfun.click();
				jsExecutor.executeScript("arguments[0].style.border='2px solid red'",addcartfun );
				
		}
		
}}}
