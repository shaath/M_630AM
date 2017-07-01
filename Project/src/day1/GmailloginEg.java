package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailloginEg {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Identifying email textbox 
		
		WebElement email=driver.findElement(By.id("identifierId"));
		//sending text into email text box
		email.sendKeys("testingtoolstrainer449");
		//Clear the text in the email textbox
//		email.clear();
		//clicking on next button
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
//		Sleeper.sleepTightInSeconds(10);
		//Entering the text into password field
		driver.findElement(By.name("password")).sendKeys("123456789");
		//Click on next button
		driver.findElement(By.cssSelector(".CwaK9")).click();
		
	}

}
