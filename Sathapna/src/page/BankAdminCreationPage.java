package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;
import generic.Excel_Data;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;

public class BankAdminCreationPage extends BaseTest
{
	//Add icon
	@FindBy(id="btn_icon_icon-plus")
	private WebElement addicn;
	//Elements in Bank Admin Create screen.
	@FindBy(xpath="//*[@id='tbAsmiUser__userId']")
	public WebElement userid;
	@FindBy(xpath="//*[@id='tbAsmiUser__userName']")
	public WebElement username;
	@FindBy(xpath="//*[@id='tbAsmiUser__userPhno1']")
	public WebElement mobilenum;
	@FindBy(xpath="//*[@id='tbAsmiUser__userEml1']")
	public WebElement emailid;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[2]/div/div[1]/div/ul/li[1]/div/a[1]/i")
	private WebElement rolesaddicn;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/div/ul/li[2]/a/i")
	private WebElement roleslovicn;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr[1]/td[1]")
	private WebElement adminrole;
	@FindBy(id="btn_icon_icon-save")
	private WebElement saveicn;
	//OK button in Bank Admin Create success alert
	@FindBy(id="popup_ok")
	private WebElement okbtn;
	//Elements in Bank Admin Search screen
	@FindBy(xpath="//*[@id='tbAsmiUser1__userId']")
	private WebElement useridsearchfield;
    @FindBy(xpath="//*[@id='btn_icon_icon-search']")
    private WebElement searchicn;
    @FindBy(xpath="//*[@id='tbAsmiUser__userId_0']")
    private WebElement useridqueryresult;
    @FindBy(xpath="//*[@id='btn_icon_icon-ok']")
    private WebElement authicon;


	public BankAdminCreationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}

	public void BankAdminCreate() throws InterruptedException, AWTException
	{
		//enter value into username field
		addicn.click();
		Thread.sleep(2000);
		
		String userid1=Excel_Data.getValue(EXCEL_PATH,"BankAdminData",1,1);
		String username1=Excel_Data.getValue(EXCEL_PATH,"BankAdminData",2,1);
		String mobilenum1=Excel_Data.getValue(EXCEL_PATH,"BankAdminData",3,1);
		String mobilenum_1=mobilenum1.replaceFirst("\\.0+$", "");
		String emailid1=Excel_Data.getValue(EXCEL_PATH,"BankAdminData",4,1);
		Thread.sleep(2000);
		
		userid.sendKeys(userid1);
		username.sendKeys(username1);
		mobilenum.sendKeys(mobilenum_1);
		emailid.sendKeys(emailid1);
		Thread.sleep(1000);
		rolesaddicn.click();
		Thread.sleep(1000);
		roleslovicn.click();
		Thread.sleep(1000);
		adminrole.click();
		Thread.sleep(1000);
		Robot R1=new Robot();
		R1.keyPress(KeyEvent.VK_UP);
		Thread.sleep(2000);
		R1.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(1000);
		saveicn.click();
		Thread.sleep(1000);
		okbtn.click();
		Thread.sleep(1000);
		
	}
	
	public void BankAdminAuthorize() throws InterruptedException
	{
		
		Thread.sleep(1000);
		String userid1=Excel_Data.getValue(EXCEL_PATH,"BankAdminData",1,1);
		useridsearchfield.sendKeys(userid1);
		Thread.sleep(1000);
		searchicn.click();
		Thread.sleep(1000);
		useridqueryresult.click();
		Thread.sleep(2000);
		authicon.click();
		Thread.sleep(1000);
		okbtn.click();
		Thread.sleep(1000);
	}



}
