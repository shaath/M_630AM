package javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEg {

	public static void main(String[] args) 
	{
		Set<Object> x=new HashSet<Object>();
		//Writing the data into hashset
		x.add("Selenium");
		x.add(50000);
		x.add(555.55);
		x.add(true);
		x.add('M');
		x.add("Selenium");
		
		Iterator<Object> it=x.iterator();
		
		while (it.hasNext())
		{
			Object data=it.next();
			System.out.println(data);
		}

	}

}
