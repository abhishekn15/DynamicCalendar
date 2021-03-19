package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarFutureDate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.id("DepartDate")).click();

		while(true) {
			try {
				driver.findElement(By.xpath("//td[@data-month='11' and @data-year='2021']/a[text()='15']")).click();
				break;
			}catch(Exception e) {
				driver.findElement(By.xpath("//a[@class=\"nextMonth \"]")).click();

			}
		}

	}

}
