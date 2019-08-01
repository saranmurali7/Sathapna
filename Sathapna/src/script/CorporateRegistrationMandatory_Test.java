package script;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel_Data;
import page.CorporateRegistrationPage;
import page.DashboardPage;
import page.LoginPage;

public class CorporateRegistrationMandatory_Test extends BaseTest
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
	@Test(priority=22,groups={"Corporate Maintainence","Regression"})
	public void CorporateRegistrationmandatorycheck() throws InterruptedException
	{
		DashboardPage DPobj1=new DashboardPage(driver);
		DPobj1.CorporateRegistrationNavigate();
		Thread.sleep(2000);
		CorporateRegistrationPage CRPObj=new CorporateRegistrationPage(driver);
		CRPObj.CorporateRegistrationmandatorycheck();
		Thread.sleep(1000);
		DPobj1.logout();
	}
	
	


}
