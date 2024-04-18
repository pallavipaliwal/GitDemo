import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDrpdwn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id= 'ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
	}

}
