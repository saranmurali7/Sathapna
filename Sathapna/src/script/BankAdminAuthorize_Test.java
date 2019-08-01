package script;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel_Data;
import page.BankAdminCreationPage;
import page.DashboardPage;
import page.LoginPage;

public class BankAdminAuthorize_Test extends BaseTest
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
	@Test(priority=2,groups={"BankAdmin","smoke"})
	public void BankAdminAuthorizeTest() throws InterruptedException
	{
		DashboardPage DPobj1=new DashboardPage(driver);
		DPobj1.BankAdminNavigate();
		Thread.sleep(2000);
		BankAdminCreationPage BACPObj=new BankAdminCreationPage(driver);
		BACPObj.BankAdminAuthorize();
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		DashboardPage DPobj1=new DashboardPage(driver);
		DPobj1.logout();
		Thread.sleep(2000);
	}

}
