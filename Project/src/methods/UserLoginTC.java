package methods;

public class UserLoginTC {

	public static void main(String[] args) 
	{
		OrgMaster om=new OrgMaster();
		String res=null;
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("SharathChandra", "SharathChandra");
		System.out.println("Application User Login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application close successfull");

	}

}
