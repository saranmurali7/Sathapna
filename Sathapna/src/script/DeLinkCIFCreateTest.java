package script;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel_Data;
import page.CIFAccountMappingPage;
import page.DELinkCIFPage;
import page.DashboardPage;
import page.LoginPage;

public class DeLinkCIFCreateTest extends BaseTest
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
	@Test(priority=17,groups={"ManageCorpUser","smoke"})
	public void DelinkCIFCreate() throws InterruptedException, AWTException
	{
		DashboardPage DPobj1=new DashboardPage(driver);
		DPobj1.DelinkCIFNavigate();
		Thread.sleep(2000);
		DELinkCIFPage CAMObj=new DELinkCIFPage(driver);
		CAMObj.DelinkCIFCreate();
		Thread.sleep(2000);
		//ECMObj.EntityCIFMappingCheck();
		//Usrtxnlimitpage cwg1= new Usrtxnlimitpage(driver);
		//cwg1.UserLimitCreation();
		Thread.sleep(1000);
	    DPobj1.logout();
	}

	

}
