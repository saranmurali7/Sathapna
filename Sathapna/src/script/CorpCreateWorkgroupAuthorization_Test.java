package script;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel_Data;
import page.CorporateRegistrationPage;
import page.CreateWorkgroupPage;
import page.DashboardPage;
import page.LoginPage;

public class CorpCreateWorkgroupAuthorization_Test extends BaseTest
{
	@BeforeMethod
	public void login() throws InterruptedException
	{
		String un=Excel_Data.getValue(EXCEL_PATH,"Valid Login",2,0);
		String pw=Excel_Data.getValue(EXCEL_PATH,"Valid Login",2,1);
		LoginPage LPobj1=new LoginPage(driver);
		LPobj1.validLogin(un, pw);
		Thread.sleep(2000);
		
	}
	@Test(priority=8,groups={"Corporate Maintainence","smoke"})
	public void CreateWorkgroupAuthorization() throws InterruptedException
	{
		DashboardPage DPobj1=new DashboardPage(driver);
		DPobj1.CorpWorkGroupNavigate();
		Thread.sleep(2000);
		CreateWorkgroupPage CRPObj=new CreateWorkgroupPage(driver);
		CRPObj.WorkgroupAuthorization();
		Thread.sleep(1000);
		DPobj1.logout();
	}
	
}
