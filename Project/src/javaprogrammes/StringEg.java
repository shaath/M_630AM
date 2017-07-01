package javaprogrammes;

public class StringEg {

	public static void main(String[] args) 
	{
		String course="Selenium";
		System.out.println("You are selected "+course);

		System.out.println(course.toUpperCase());
		System.out.println(course.toLowerCase());
		
		System.out.println(course.replace('e', 'a'));
		
		System.out.println(course.substring(2, 6));
	}

}
