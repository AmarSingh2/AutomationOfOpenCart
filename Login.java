package OpenCartAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
//		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//a[@title='My Account']"));
		element.click();
		
		//Login credential
		WebElement element1 = driver.findElement(By.linkText("Login"));
		element1.click();
		
		driver.findElement(By.id("input-email")).sendKeys("amar877057@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Am@rsingh24");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
