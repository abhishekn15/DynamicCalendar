package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement slider = driver.findElement(By.id("loanamountslider"));
		//driver.switchTo().frame(slider);
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, 100, 0).perform();
		WebElement slider1 =driver.findElement(By.id("loaninterestslider"));
		Actions act1=new Actions(driver);
		act1.dragAndDropBy(slider1, -50, 0).perform();
		
		}

	}


