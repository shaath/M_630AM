Feature: Login & Logout Test
	
		Scenario: Login Test
			Given the browser launched and navigated to url
			When the enters username, Password
			And clicks on login
			Then welcome admin message displayed
			
		Scenario: Logout Test
			When tester clicks on welcome admin link
			And also clicks on logout link
			Then login page displayed	