package OpenCartAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
//		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//a[@title='My Account']"));
		element.click();
		
		WebElement element1 = driver.findElement(By.linkText("Register"));
		element1.click();
		
		// Firstname , Lastname , email , Telephone 
			driver.findElement(By.name("firstname")).sendKeys("Amar");
			driver.findElement(By.name("lastname")).sendKeys("Singh");
			driver.findElement(By.name("email")).sendKeys("amar877057@gmail.com");
			driver.findElement(By.name("telephone")).sendKeys("8770573111");
			
		// Password and Confirm passowrd
			driver.findElement(By.name("password")).sendKeys("Am@rsingh24");
			driver.findElement(By.name("confirm")).sendKeys("Am@rsingh24");
			
		//Continue And Get click
			driver.findElement(By.name("agree")).click();
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
			
			

		
			
			


		
	
	}

}
