import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdwnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		WebElement drpdown = driver.findElement(By.xpath("//select[@class ='form-control']"));
		
		drpdown.click();
		
		
		Select s = new Select(drpdown);
		
		List<WebElement> drpele = s.getOptions();
		System.out.println("the data is:" +drpele);
		
		
		

	}

}
