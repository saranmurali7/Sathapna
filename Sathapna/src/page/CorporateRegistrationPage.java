package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import generic.BaseTest;
import generic.Excel_Data;

public class CorporateRegistrationPage extends BaseTest
{
	//Add icon
	@FindBy(id="btn_icon_icon-plus")
	private WebElement addicn;
   //Elements for Corporate Registration Creation screen.
	@FindBy(xpath="//*[@id='custID']")
	private WebElement corporateid;
	@FindBy(xpath="//*[@id='max_no_user']")
	private WebElement Maxnoofusers;
	@FindBy(xpath="//*[@id='Customer-Full__NAME']")
	private WebElement Companyname;
	@FindBy(xpath="//*[@id='Custpersonal__MOBNUM']")
	private WebElement Mobilenum;
	@FindBy(xpath="//*[@id='Custcorp__NATIONID']")
	private WebElement registrationno;
	@FindBy(xpath="//*[@id='Custpersonal__EMAIL']")
	private WebElement emailid;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div[4]/ul/li[2]/div/ul/li[2]/a/i")
	private WebElement Dateoficorporation;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div[4]/ul/li[2]/div/ul/li[2]/a/i")
	private WebElement yeardecarrow;
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[4]/div[1]/div")
	private WebElement datesel;
	@FindBy(xpath="//*[@id='btn_icon_icon-save']")
	private WebElement saveicon;
	@FindBy(id="popup_ok")
	private WebElement okbtn;
	//Elements for Corporate Create Authorization:
	@FindBy(xpath="//*[@id='btn_icon_icon-search']")
	private WebElement searchicn;
	@FindBy(xpath="//*[@id='companyName']")
	private WebElement cmpnamesearch;
	@FindBy(xpath="//*[@id='apztbCorpRegistration__preferredCorpId_0']")
	private WebElement corpregqueryresult;
	@FindBy(xpath="//*[@id='btn_icon_icon-ok']")
	private WebElement authicon;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/div/div/div/div/ul/li[2]/ul/li[1]/a")
	private WebElement corpreglink;
	@FindBy(id="popup_message")
	private WebElement manpopupmsg;
	
	//Edit Option
	@FindBy(id="btn_icon_icon-unlock-alt")
	private WebElement unlockicn;
	@FindBy(id="apztbCorpRegistration__maxNoUsers")
	private WebElement mxusrs;
	@FindBy(id="apztbCorpRegistration__companyName")
	private WebElement cmpnm;
	@FindBy(id="apztbCorpRegistration__registeredNumber")
	private WebElement regno1;
	@FindBy(id="apztbCorpRegistration__emailId")
	private WebElement corpregemail;
	@FindBy(id="apztbCorpRegistration__phoneNo")
	private WebElement corpregphno;
	public CorporateRegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}


	public void CorporateRegistrationCreation() throws InterruptedException 
	{
		addicn.click();
		String crpid=Excel_Data.getValue(EXCEL_PATH,"CorporateRegistrationCreation",1,1).replaceFirst("\\.0+$", "");
		String maxusrs=Excel_Data.getValue(EXCEL_PATH,"CorporateRegistrationCreation",2,1).replaceFirst("\\.0+$", "");
		String cmpname=Excel_Data.getValue(EXCEL_PATH,"CorporateRegistrationCreation",3,1);
		String mobno=Excel_Data.getValue(EXCEL_PATH,"CorporateRegistrationCreation",4,1).replaceFirst("\\.0+$", "");
		String emailid1=Excel_Data.getValue(EXCEL_PATH,"CorporateRegistrationCreation",6,1);
		String regno=Excel_Data.getValue(EXCEL_PATH,"CorporateRegistrationCreation",5,1).replaceFirst("\\.0+$", "");
		corporateid.sendKeys(crpid);
		Thread.sleep(1000);
		Maxnoofusers.sendKeys(maxusrs);
		Thread.sleep(1000);
		Companyname.sendKeys(cmpname);
		Thread.sleep(1000);
		Mobilenum.sendKeys(mobno);
		Thread.sleep(1000);
		registrationno.sendKeys(regno);
		Thread.sleep(1000);
		emailid.sendKeys(emailid1);
		Thread.sleep(1000);
		Dateoficorporation.click();
		Thread.sleep(1000);
		//yeardecarrow.click();
		//Thread.sleep(1000);
		//yeardecarrow.click();
		//Thread.sleep(1000);
		datesel.click();
		Thread.sleep(1000);
		saveicon.click();
		Thread.sleep(3000);
		okbtn.click();
		Thread.sleep(2000);
		corpreglink.click();
		Thread.sleep(2000);
	}


	public void CorporateCreationAuthorization() throws InterruptedException 
	{
		
			String cmpname=Excel_Data.getValue(EXCEL_PATH,"CorporateRegistrationCreation",3,1);
			cmpnamesearch.sendKeys(cmpname);
			Thread.sleep(1000);
			searchicn.click();
			Thread.sleep(2000);
			corpregqueryresult.click();
			Thread.sleep(4000);
			authicon.click();
			Thread.sleep(1000);
			okbtn.click();
			Thread.sleep(2000);	
		}


	public void CorporateRegistrationmandatorycheck() throws InterruptedException 
	{
		addicn.click();
		Thread.sleep(1000);
		saveicon.click();
		String manerrorexp=Excel_Data.getValue(EXCEL_PATH,"CorporateRegistrationCreation",7,1);
		String Manerroractual=manpopupmsg.getText();
		System.out.println(Manerroractual);
		okbtn.click();
		Assert.assertEquals(Manerroractual,manerrorexp);
		Reporter.log(Manerroractual);
	}


	public void CorporateRegistrationedit() throws InterruptedException 
	{
		//Thread.sleep(1000);
		String cmpname=Excel_Data.getValue(EXCEL_PATH,"CorporateRegistrationEdit",8,1);
		String cmpname1=Excel_Data.getValue(EXCEL_PATH,"CorporateRegistrationEdit",3,1);
		String maxusrs=Excel_Data.getValue(EXCEL_PATH,"CorporateRegistrationEdit",2,1).replaceFirst("\\.0+$", "");
		String mobno=Excel_Data.getValue(EXCEL_PATH,"CorporateRegistrationEdit",4,1).replaceFirst("\\.0+$", "");
		String emailid1=Excel_Data.getValue(EXCEL_PATH,"CorporateRegistrationEdit",6,1);
		String regno=Excel_Data.getValue(EXCEL_PATH,"CorporateRegistrationEdit",5,1).replaceFirst("\\.0+$", "");
		cmpnamesearch.sendKeys(cmpname);
		Thread.sleep(1000);
		searchicn.click();
		Thread.sleep(1000);
		corpregqueryresult.click();
		Thread.sleep(2000);
		unlockicn.click();
		Thread.sleep(2000);
		mxusrs.clear();
		cmpnm.clear();
		regno1.clear();
		corpregemail.clear();
		corpregphno.clear();
		Thread.sleep(1000);
		mxusrs.sendKeys(maxusrs);
		Thread.sleep(1000);
		cmpnm.sendKeys(cmpname1);
		Thread.sleep(1000);
		regno1.sendKeys(regno);
		Thread.sleep(1000);
		corpregemail.sendKeys(emailid1);
		Thread.sleep(1000);
		corpregphno.sendKeys(mobno);
		Thread.sleep(1000);
		saveicon.click();
		Thread.sleep(1000);
		okbtn.click();
		Thread.sleep(1000);
	}


}
