import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelFun_rev {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		
		//STATIC SELECT DROPDOWN 
		
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//STATIC DROPDOWN WITH DIFFERENT CLICKS IN THE DROPDOWN
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		/*
		 * int i = 1; while(i<5) { driver.findElement(By.id("hrefIncAdt")).click(); i++;
		 * }
		 */
		
		for(int i = 1; i<5; i++)
		{
			 driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		
	//---------------------DYNAMIC SELECT DROPDOWN------------
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		
		
		//----------------------COUNT NUMBER OF CHECK BOXES IN THE SCREEN
		
		System.out.println(driver.findElements(By.xpath("//input[@type = 'checkbox]")).size());
		
		//-------------TESTNG is a testing framework--------
		
		
	}

}
