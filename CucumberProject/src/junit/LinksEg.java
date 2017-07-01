package junit;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LinksEg extends Primus_Master
{
	@Test
	public void links()
	{
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for (int i = 0; i < link.size(); i++)
		{
			String t=link.get(i).getText();
			System.out.println(t);
		}
	}
}
