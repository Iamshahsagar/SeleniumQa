package assign;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UPOSin {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
			
		driver.get("https://upos.globalgarner.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("navbarDropdown")).click();
		driver.findElement(By.partialLinkText("UPOS App")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.findElement(By.id("username")).sendKeys("7802951354");
		driver.findElement(By.id("password")).sendKeys("global916" + Keys.ENTER);
		
		

}
}