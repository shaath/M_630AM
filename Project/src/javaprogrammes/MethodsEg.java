package javaprogrammes;

public class MethodsEg {

	public static void main(String[] args)
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		MethodsEg m=new MethodsEg();
		m.function3();
		
		boolean flag=m.function4();
		System.out.println(flag);
	}
	//static Method without returning anyvalue
	public static void function1()
	{
		System.out.println("Hi this is Function1 code");
	}
	//static Method with returning value
	public static String function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}
	//Non Static Static Method without returning any value
	public void function3()
	{
		System.out.println("THis is Function3 code");
	}
	//Non static Method with returning value
	public boolean function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
}
