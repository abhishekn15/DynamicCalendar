package HeadlessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IgconitoMode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--Incognito");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String GetCurrentUrl = driver.getCurrentUrl();
		String Present  = driver.getTitle();
		System.out.println(Present);
		System.out.println(GetCurrentUrl);
		driver.close();

	}

}
