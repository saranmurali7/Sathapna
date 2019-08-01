package script;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel_Data;
import page.DashboardPage;
import page.LoginPage;
import page.MapWorkgroupPage;
import page.UserTransactionLimitPage;

public class MapWorkgroupcreation_Test extends BaseTest
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
	@Test(priority=11,groups={"Corporate Maintainence","smoke"})
	public void MapWorkgroupcreation() throws InterruptedException, AWTException
	{
		DashboardPage DPobj1=new DashboardPage(driver);
		DPobj1.mapWorkgroupNavigate();
		Thread.sleep(2000);
		MapWorkgroupPage MWGObj=new MapWorkgroupPage(driver);
		MWGObj.WorkgroupCreation();
		Thread.sleep(1000);
		DPobj1.logout();
	}
}
