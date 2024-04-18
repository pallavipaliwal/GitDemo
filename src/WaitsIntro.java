import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//--- IMPLICIT WAIT WILL DECLARE THE WAIT GLOBALLY, IT WILL APPLICABLE TO ALL THE TEST CASES
		
		
		//*Readable code
		//*wont be able to validate the performance issue
		
		//-- EXPLICIT WAIT WE CAN TARGET A SPECIFIC ELEMENT OR SPECIFIC TEST CASE - IT WILL BE APPLICABLE TO SPECIFIC ELEMENT 
		
		//PROS - Can be applied only at target elements so no performance issue
		//Cons - More code
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/");
		

	}

}
