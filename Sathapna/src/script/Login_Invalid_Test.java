package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel_Data;
import page.DashboardPage;
import page.LoginPage;

public class Login_Invalid_Test extends BaseTest
{
	@Test(priority=0,groups={"login","Regression"})
	public void InvalidLoginTest() throws InterruptedException
	{
		LoginPage LPobj1=new LoginPage(driver);
		LPobj1.Loginblank();
		Thread.sleep(1000);
		LPobj1.Loginuseridblank();
		Thread.sleep(1000);
		LPobj1.Loginpwdblank();
		Thread.sleep(1000);
		LPobj1.Logininvuserid();
		Thread.sleep(1000);
		LPobj1.Logininvpwd();
		Thread.sleep(1000);
		LPobj1.Logininvusridpwd();
		
	    
	}

}
