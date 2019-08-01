package script;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Excel_Data;
import page.BankAdminCreationPage;
import page.DashboardPage;
import page.LoginPage;

public class BankAdminCreate_Test extends BaseTest
{


	@BeforeMethod
	public void login() throws InterruptedException
	{
		String un=Excel_Data.getValue(EXCEL_PATH,"Valid Login",1,0);
		String pw=Excel_Data.getValue(EXCEL_PATH,"Valid Login",1,1);
		LoginPage LPobj1=new LoginPage(driver);
		LPobj1.validLogin(un, pw);
		Thread.sleep(2000);

	}

	@Test(priority=1,groups={"BankAdmin","smoke"})
	public void BankAdminCreateTest() throws InterruptedException, AWTException
	{
		DashboardPage DPobj1=new DashboardPage(driver);
		DPobj1.BankAdminNavigate();
		Thread.sleep(2000);
		BankAdminCreationPage BACPObj=new BankAdminCreationPage(driver);
		BACPObj.BankAdminCreate();
		Thread.sleep(2000);
		DPobj1.logout();
	}

}
