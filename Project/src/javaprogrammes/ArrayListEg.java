package javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args)
	{
		ArrayList<String> x=new ArrayList<String>();
		//Writing the data into arraylist
		x.add("Selenium");
		x.add("UFT");
		x.add("Manual");
		x.add("Apple");
		x.add("Boll");
		x.add("Apple");
		x.add(8, "Sharath");
		
		//Finding the length of the arraylist
		System.out.println(x.size());
		
		//Reading the data from arraylist
		
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
		}

	}

}
