package javaprogrammes;

public class NestedIf {

	public static void main(String[] args)
	{
		int a=300;
		int b=2000;
		int c=10000;
		
		if(a > b & a > c)
		{
			System.out.println("A is Greater");
		}
		else if (b > a & b > c)
		{
			System.out.println("B is Greater");
		}
		else
		{
			System.out.println("C is Greater");
		}

	}

}
