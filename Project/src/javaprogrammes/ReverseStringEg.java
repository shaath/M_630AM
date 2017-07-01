package javaprogrammes;

public class ReverseStringEg {

	public static void main(String[] args) 
	{
		String course="QEdge";
		//Finding the length of the String
		int len=course.length();
		System.out.println(len);

//		System.out.println(course.charAt(3));
		
		for (int i = 0; i < len; i++) 
		{
			System.out.println(course.charAt(i));
		}
		System.out.println("***");
		for (int i = len-1; i >= 0; i--)
		{
			System.out.print(course.charAt(i));
		}
	}

}
