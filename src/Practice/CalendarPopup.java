package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarPopup  {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.trivago.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@key=\"checkInButton\"]")).click();
		
		while(true) {
			try {
				driver.findElement(By.xpath("//time[@datetime=\"2021-06-30\"]")).click();
				break;
			}catch(Exception e) {
				driver.findElement(By.xpath("//span[@class=\"icon-ic cal-btn-ic icon-rtl\"]")).click();
				
			}
		}
		
		//driver.findElement(By.xpath("//span[@class=\"icon-ic icon-contain fill-maincolor-04-light\"]")).click();
		//driver.close();





	}

}
