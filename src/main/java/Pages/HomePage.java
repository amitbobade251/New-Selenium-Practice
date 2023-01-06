package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.anshu.Base.BasePage;

public class HomePage extends BasePage
{


	public void Customers()
	{
		driver.findElement(By.cssSelector(".zh-customers")).click();
	}
	public void Supports()
	{
		driver.findElement(By.cssSelector(".zh-support")).click();
	}
	public void ContactSales()
	{
		driver.findElement(By.cssSelector(".zh-contact")).click();
	}
	public void SignIn()
	{
		driver.findElement(By.cssSelector(".zh-login")).click();
	}
	public void FreeSignUp()
	{
		driver.findElement(By.cssSelector(".zh-signup")).click();
	}
	public void Search()
	{
		driver.findElement(By.cssSelector(".menu-search-icon")).click();
	}
	public void CRM()
	{
		driver.findElement(By.cssSelector(".zpa-row")).click();
	}
	public void Books()
	{
		driver.findElement(By.xpath("//ul/li[@class='zp-main-apps zp-main-books zapp-show']")).click();
	}
	public void Mail()
	{
		driver.findElement(By.xpath("//ul/li[@class='zp-main-apps zp-main-mail zapp-show']")).click();
	}
	public void People()
	{
		driver.findElement(By.xpath("//ul/li[@class='zp-main-apps zp-main-people zapp-show']")).click();
	}
	public void Project()
	{
		driver.findElement(By.xpath("//ul/li[@class='zp-main-apps zp-main-desk zapp-show']")).click();
	}
	public void Workplace()
	{
		driver.findElement(By.xpath("")).click();
	}
	public void Assist()
	{
		driver.findElement(By.xpath("")).click();
	}
	public void Meeting()
	{
		driver.findElement(By.xpath("")).click();
	}
	public void ValidateFooterLinks()
	{
		driver.findElement(By.xpath("")).click();
	}

}
