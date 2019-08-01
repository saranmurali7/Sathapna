package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel_Data;

public class CreateWorkgroupPage extends BaseTest
{
	//Add icon
	@FindBy(id="btn_icon_icon-plus")
	private WebElement addicn;
	//Elements for WorkGroup Creation screen.
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/div[1]/ul/li[2]/div/ul/li[2]/a/i")
	private WebElement Corporateid;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/div[2]/ul/li[2]/div/ul/li[2]/a/i")
	private WebElement Limitgroupid;
	@FindBy(xpath="//*[@id='grpId']")
	private WebElement groupid;
	@FindBy(xpath="//*[@id='grpName']")
	private WebElement groupname;
	//Corporate ID LOV
	@FindBy(xpath="//*[@id='CUSTOMER_IDFilter']")
	private WebElement custidlov;
	@FindBy(xpath="//*[@id='searchlovval']")
	private WebElement searchbtnlov;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td[2]")
    private WebElement custidsearchresult;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr[1]/td")
	private WebElement limitgrpid;
	//Save options
	@FindBy(xpath="//*[@id='btn_icon_icon-save']")
	private WebElement saveicon;
	@FindBy(id="popup_ok")
	private WebElement okbtn;
	//Elements for Corporate Create Authorization:
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[2]/div/ul/li[2]/a/i")
    private WebElement corporateidsrclov;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td[2]")
	private WebElement crpidselres;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/ul/li[2]/a/i")
	private WebElement grpidlov;
	@FindBy(xpath="//*[@id='GROUP_IDFilter']")
	private WebElement grpidlovfld;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td")
	private WebElement grpidsrcres;
	@FindBy(xpath="//*[@id='btn_icon_icon-search']")
	private WebElement searchicn;
	@FindBy(xpath="//*[@id='apztbGroupDetails__groupId_0']")
	private WebElement workgrpqueryres;
	@FindBy(xpath="//*[@id='btn_icon_icon-ok']")
	private WebElement authicon;
	
	public CreateWorkgroupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}

	
	public void WorkgroupCreation() throws InterruptedException 
	{
		addicn.click();
		Thread.sleep(2000);
		
		String custid=Excel_Data.getValue(EXCEL_PATH,"WorkGroup",1,1).replaceFirst("\\.0+$", "");
		String grpid=Excel_Data.getValue(EXCEL_PATH,"WorkGroup",2,1).replaceFirst("\\.0+$", "");
		String grpname=Excel_Data.getValue(EXCEL_PATH,"WorkGroup",3,1);
		Corporateid.click();
		Thread.sleep(1000);
		custidlov.sendKeys(custid);
		searchbtnlov.click();
		custidsearchresult.click();
		Thread.sleep(1000);
		Limitgroupid.click();
		Thread.sleep(1000);
		limitgrpid.click();
		Thread.sleep(1000);
		groupid.sendKeys(grpid);
		Thread.sleep(1000);
		groupname.sendKeys(grpname);
		Thread.sleep(1000);
		saveicon.click();
		Thread.sleep(1000);
		okbtn.click();
		Thread.sleep(1000);
	}



	public void WorkgroupAuthorization() throws InterruptedException 
	{
		String custid=Excel_Data.getValue(EXCEL_PATH,"WorkGroup",1,1).replaceFirst("\\.0+$", "");
		String grpid=Excel_Data.getValue(EXCEL_PATH,"WorkGroup",2,1).replaceFirst("\\.0+$", "");
		corporateidsrclov.click();
		Thread.sleep(1000);
        custidlov.sendKeys(custid);
        Thread.sleep(1000);
        searchbtnlov.click();
		Thread.sleep(1000);
		crpidselres.click();
		Thread.sleep(1000);
		grpidlov.click();
		Thread.sleep(1000);
		grpidlovfld.sendKeys(grpid);
		searchbtnlov.click();
		grpidsrcres.click();
		Thread.sleep(1000);
		searchicn.click();
		Thread.sleep(1000);
		workgrpqueryres.click();
		Thread.sleep(1000);
		authicon.click();
		Thread.sleep(1000);
		okbtn.click();


	}
	

	

}
