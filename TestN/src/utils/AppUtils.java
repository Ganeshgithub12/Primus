package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AppUtils {

	

  @BeforeSuite
	public void launchapp() {
		System.out.println("launching app");
	}
		
		
	@BeforeTest
public void login() {
	System.out.println("login");
		
	
}
@AfterTest
public void logouT() {
	System.out.println("logout");
}
@AfterSuite
public void closeapp() {
	System.out.println("close app");
}


	}




