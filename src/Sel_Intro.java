import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Intro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			
			driver.get("https://rahulshettyacademy.com/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.findElement(By.className("register-btn")).click();
			driver.findElement(By.id("email")).sendKeys("Pallavi");
			Thread.sleep(2);
			driver.findElement(By.className("password")).sendKeys("Paliwal");
			String msg = driver.findElement(By.xpath("//div[contains(text(),'Please provide a valid email address')]")).getText();
			
			System.out.println(msg);
		
			Calendar calendar = Calendar.getInstance();
			Date currentDateTime = calendar.getTime();
			System.out.println(currentDateTime);
			driver.quit();
			
	}

	//---CNTL+SHIFT+J - is used in order to open the html page to locate the element

		
	}


