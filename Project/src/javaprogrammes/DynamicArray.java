package javaprogrammes;

public class DynamicArray {

	public static void main(String[] args) 
	{
		Object[] s=new Object[5];
		
		//Length of the array
		System.out.println(s.length);
		
		//Writing the data into Array
		s[2]=50000;
		s[4]="Selenium";
		s[2]=60000;
		
		//Reading the data from an array
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
		}
		
	}

}
