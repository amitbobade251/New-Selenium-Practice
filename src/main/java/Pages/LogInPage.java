package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.anshu.Base.BasePage;

public class LogInPage extends BasePage
{
   
	public HomePageProfile IdEnter()
	{
		driver.findElement(By.cssSelector("#login_id")).sendKeys("amit.bobade251@gmail.com");
		driver.findElement(By.xpath("//button[@class='btn blue'][@id='nextbtn']")).click();
		WebDriverWait wait= new WebDriverWait(driver,30);
		
		WebElement password=driver.findElement(By.cssSelector("#password"));
		
		wait.until(ExpectedConditions.elementToBeClickable(password));
		password.sendKeys("Madhuri@2022");
		
		driver.findElement(By.xpath("//button[@class='btn blue'][@id='nextbtn']")).click();
		
		return new HomePageProfile();
		
	}
}
