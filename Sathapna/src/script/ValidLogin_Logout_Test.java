package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel_Data;
import page.DashboardPage;
import page.LoginPage;

public class ValidLogin_Logout_Test extends BaseTest
{
	
@Test(priority=0,groups={"login","smoke"})
public void validLoginLogoutTest() throws InterruptedException
{
	String un=Excel_Data.getValue(EXCEL_PATH,"Valid Login",1,0);
	String pw=Excel_Data.getValue(EXCEL_PATH,"Valid Login",1,1);
	LoginPage LPobj1=new LoginPage(driver);
	LPobj1.validLogin(un, pw);
	Thread.sleep(10000);
    DashboardPage DPobj=new DashboardPage(driver);
    DPobj.logout();
    Thread.sleep(2000);
}
	
	
}


