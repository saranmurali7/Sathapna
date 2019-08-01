package script;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel_Data;
import page.DashboardPage;
import page.EntityCIFMappingPage;
import page.LoginPage;
import page.UserTransactionLimitPage;

public class EntityCIFMappingCreateTest extends BaseTest
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
	@Test(priority=13,groups={"ManageCorpUser","smoke"})
	public void EntityCIFMappingCreation() throws InterruptedException, AWTException
	{
		DashboardPage DPobj1=new DashboardPage(driver);
		DPobj1.EntityCIFMappingNavigate();
		Thread.sleep(2000);
		EntityCIFMappingPage ECMObj=new EntityCIFMappingPage(driver);
		ECMObj.EntityCIFMappingCreate();
		Thread.sleep(2000);
		//ECMObj.EntityCIFMappingCheck();
		//Usrtxnlimitpage cwg1= new Usrtxnlimitpage(driver);
		//cwg1.UserLimitCreation();
		Thread.sleep(1000);
	    DPobj1.logout();
	}

}
