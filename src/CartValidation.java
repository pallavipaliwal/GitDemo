import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartValidation {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(30)); //*********
	
		
		
		//IN ORDER TO ADD MULTIPLE PRODUCTS TO THE CART LOGIC - In this case we have to create an array of all the product that we need to add
		
		String[] veg = {"Cucumber", "Brocolli"};
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		System.out.println(driver.getTitle());
		addToCart(driver,veg);
		driver.findElement(By.cssSelector("img[alt = 'Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class = 'promoBtn']")).click();
		
		//Explicit wait
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class = 'promoInfo']")));
		
		System.out.println(driver.findElement(By.xpath("//span[@class = 'promoInfo']")).getText());
	}

	
	public static void addToCart(WebDriver driver, String[] veg)
	{
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(products.size());
		for(int i = 0; i<products.size(); i++)
		{
			
			// Now we have to format the name of the item in the cart
			String[] name = products.get(i).getText().split("-");
					String formattedname = name[0].trim();
			//lets convert the array to ArrayList
			
			List itemsneeded = Arrays.asList(veg);
			
			if(itemsneeded.contains(formattedname))
			//if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
			}
			
		}
		
	}
}
	
	

	
	
