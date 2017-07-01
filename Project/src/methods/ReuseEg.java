package methods;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ReuseEg {

	public static void main(String[] args) throws IOException
	{
		MethodsEg m=new MethodsEg();
		
		int res=m.sum(400, 600);
		System.out.println(res);
		
		m.launch_Br("ie");
		m.driver.get("http://twitter.com");
		
		m.takes_Screenshot("F:\\Morning630\\Project\\src\\screenshots\\twitter.bmp");

	}

}
