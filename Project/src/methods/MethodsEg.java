package methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MethodsEg 
{
	public static WebDriver driver=null;
	public static void main(String[] args)
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		MethodsEg m=new MethodsEg();
		
		m.function3();
		
		boolean flag=m.function4();
		System.out.println(flag);
		
		int result=m.sum(40,60);
		System.out.println(result);
	}
	
	//static method without returning any value
	public static void function1()
	{
		System.out.println("This is Function1 code");
	}
	//static  method with returning value
	public static String function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}
	//Non Static Method without returning any value
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	//Nonstatic Method with returning value
	public boolean function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
	
	//Sum 
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public void takes_Screenshot(String path) throws IOException
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));

	}
	
	public void launch_Br(String br)
	{
		if (br.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\Cdownloads/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
	}

}
