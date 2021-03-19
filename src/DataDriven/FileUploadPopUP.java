package DataDriven;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUP {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		WebElement uploadButton = driver.findElement(By.id("wdgt-file-upload"));
		uploadButton.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("‪F:\\Autioit\\NaukriUPload.exe");
		driver.quit();
		
		

	}
	
}
