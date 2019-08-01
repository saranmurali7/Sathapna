
package script;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel_Data;
import page.BankAdminCreationPage;
import page.CorporateRegistrationPage;
import page.DashboardPage;
import page.LoginPage;

public class CorporateRegistration_Test  extends BaseTest
{
	@BeforeMethod(alwaysRun=true)
	public void login() throws InterruptedException
	{
		String un=Excel_Data.getValue(EXCEL_PATH,"Valid Login",1,0);
		String pw=Excel_Data.getValue(EXCEL_PATH,"Valid Login",1,1);
		LoginPage LPobj1=new LoginPage(driver);
		LPobj1.validLogin(un, pw);
		Thread.sleep(2000);
		
	}
	@Test(priority=3,groups={"Corporate Maintainence","smoke"})
	public void CorporateRegistration() throws InterruptedException
	{
		DashboardPage DPobj1=new DashboardPage(driver);
		DPobj1.CorporateRegistrationNavigate();
		Thread.sleep(2000);
		CorporateRegistrationPage CRPObj=new CorporateRegistrationPage(driver);
		CRPObj.CorporateRegistrationCreation();
		Thread.sleep(1000);
		DPobj1.logout();
	}
	
	
}
