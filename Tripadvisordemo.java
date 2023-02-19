
package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tripadvisordemo {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.tripadvisor.in");
		//driver.get("https://www.tripadvisor.in/");
		Thread.sleep(3000);
		WebElement clicksearch=driver.findElement(By.xpath("//*[@id='lithium-root']/main/div[3]/div/div[1]/div[1]/form/input[1]"));
		Thread.sleep(2000);
		
		clicksearch.sendKeys("Club Mahindra");
		WebElement searchbutton=driver.findElement(By.xpath("//*[@id=\"lithium-root\"]/main/div[3]/div/div/div/form/button[3]"));
		searchbutton.click();
		//WebElement resultsearch=driver.findElement(By.xpath("//*[@class='riJbp _G _H B- _S t u j Cj PGlr]"));
		Thread.sleep(3000);
		WebElement resultsearch=driver.findElement(By.xpath("(//*[@class='result-title'])[1]"));
		//*[@id="BODY_BLOCK_JQUERY_REFLOW"]/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div
		Thread.sleep(3000);
		resultsearch.click();
		
		 Actions action = new Actions(driver);
	        Thread.sleep(3000);
	        Action sendEsc = action.sendKeys(Keys.ESCAPE).build();
	        Thread.sleep(3000);
	        sendEsc.perform();
	        Thread.sleep(3000);
	       // driver.findElement(By.xpath("//*[@class='kNGcD Cg f']")).click();
//	        Thread.sleep(3000);
//	        sendEsc.perform();
		// Locating the Main Menu (Parent element)
		
		//WebElement mainMenu = driver.findElement(By.xpath("//*[@class='kNGcD Cg f']"));
		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"component_3\"]/div/div/div[2]/div/div[1]/div[1]/a"));
		mainMenu.click();
		Thread.sleep(3000);
		//Instantiating Actions class
	//	Actions actions = new Actions(driver);
	//	Thread.sleep(3000);
		//Hovering on main menu
		action.moveToElement(mainMenu);
		Thread.sleep(3000);
		// Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"lithium-root\"]/main/div[2]/div/div[2]/div/form/div[1]/span/span[1]/label[5]"));

		//To mouseover on sub menu
		action.moveToElement(subMenu);

		//build()- used to compile all the actions into a single step 
		action.click().build().perform();
		//drivr.close();
		//mine->//*[@id='lithium-root']/main/div[3]/div/div[1]/div[1]   ->//*[@id='lithium-root']/main/div[3]/div/div[1]/div[1]/form/input[1]
	}

}