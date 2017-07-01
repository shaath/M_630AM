package methods;

public class TestSuite {

	public static void main(String[] args) 
	{
//		//Login
		OrgMaster om=new OrgMaster();
		String res=null;
//		
//		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
//		System.out.println("Application Launch "+res);
//		
//		res=om.org_Login("Admin", "admin");
//		System.out.println("Application Login "+res);
//		
//		res=om.org_Logout();
//		System.out.println("Application Logout "+res);
//		
//		om.org_Close();
//		System.out.println("Application close successfull");
//		
//		//Empreg
//		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
//		System.out.println("Application Launch "+res);
//		
//		res=om.org_Login("Admin", "admin");
//		System.out.println("Application Login "+res);
//		
//		res=om.org_Empreg("Venkat", "Ch");
//		System.out.println("Employee registration "+res);
//		
//		res=om.org_Logout();
//		System.out.println("Application Logout "+res);
//		
//		om.org_Close();
//		System.out.println("Application close successfull");
//		
//		//User reg
//		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application User Login "+res);
		
		res=om.org_Userreg("Venkat Ch", "VenkatCh12345", "VenkatCh12345", "VenkatCh12345");
		System.out.println("Userreg "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application close successfull");
		
		//UserlOGIN	
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("VenkatCh12345", "VenkatCh12345");
		System.out.println("Application User Login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application close successfull");
		
		

	}

}
