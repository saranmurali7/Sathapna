package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.BaseTest;
import generic.Excel_Data;

public class MapWorkgroupPage extends BaseTest
{
	@FindBy(xpath="//*[@id='btn_icon_icon-plus']")
	private WebElement addicn;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div[2]/div[1]/div/ul/li[2]/div/ul/li[2]/a/i")
	private WebElement corpidlovicn;
	@FindBy(xpath="//*[@id='CUSTOMER_IDFilter']")
	private WebElement custidlovfld;
	@FindBy(xpath="//*[@id='searchlovval']")
	private WebElement srchlovbtn;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td[1]")
	private WebElement srchres;
	@FindBy(id="apztbGroupDetails__groupId")
	private WebElement grpidsel;
	

	@FindBy(id="grpSingleAuth")
	private WebElement authlevsel;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/ul/li[1]/div/a[1]/i")
	private WebElement usraddicn;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div[2]/table/tbody/tr/td[2]/div/ul/li[2]/a/i")
	private WebElement usrsellov;
	@FindBy(xpath="//*[@id='USER_IDFilter']")
	private WebElement useridlovfld;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td[2]")
	private WebElement usridsrchres;
	@FindBy(xpath="//*[@id='btn_icon_icon-save']")
	private WebElement saveicon;
	@FindBy(id="popup_ok")
	private WebElement okbtn;
	
	//Authorization
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div[2]/div[1]/div[1]/ul/li[2]/div/ul/li[2]/a/i")
	private WebElement crpidlov;
	@FindBy(xpath="//*[@id='CUSTOMER_IDFilter']")
	private WebElement cstidlovfld;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td[2]")
	private WebElement cussrcres;
	@FindBy(xpath="//*[@id='btn_icon_icon-search']")
	private WebElement srchicn;
	@FindBy(xpath="//*[@id='apztbGroupMapping__groupId_0']")
	private WebElement qryres;
	@FindBy(xpath="//*[@id='btn_icon_icon-ok']")
	private WebElement authicon;
	
	
	
	public MapWorkgroupPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void WorkgroupCreation() throws InterruptedException 
	{
		String custid=Excel_Data.getValue(EXCEL_PATH,"Map WorkGroup",1,1).replaceFirst("\\.0+$", "");
		String userid=Excel_Data.getValue(EXCEL_PATH,"Map WorkGroup",2,1).replaceFirst("\\.0+$", "");
		addicn.click();
		Thread.sleep(1000);
		corpidlovicn.click();
		Thread.sleep(1000);
		custidlovfld.sendKeys(custid);
		srchlovbtn.click();
		Thread.sleep(1000);
		srchres.click();
		Thread.sleep(1000);
		Select gpid=new Select(grpidsel);
		gpid.selectByIndex(1);
		Thread.sleep(1000);
		Select authlvlid=new Select(authlevsel);
		authlvlid.selectByIndex(1);
		Thread.sleep(1000);
		usraddicn.click();
		Thread.sleep(1000);
		usrsellov.click();
		Thread.sleep(1000);
		useridlovfld.sendKeys(userid);
		srchlovbtn.click();
		Thread.sleep(1000);
		srchres.click();
		Thread.sleep(1000);
		saveicon.click();
		Thread.sleep(1000);
		okbtn.click();
		Thread.sleep(1000);
	}
	public void Workgroupauth() throws InterruptedException
	{
		String custid=Excel_Data.getValue(EXCEL_PATH,"Map WorkGroup",1,1).replaceFirst("\\.0+$", "");
		crpidlov.click();
		Thread.sleep(1000);
		cstidlovfld.sendKeys(custid);
		srchlovbtn.click();
		cussrcres.click();
		Thread.sleep(1000);
		srchicn.click();
		Thread.sleep(1000);
		qryres.click();
		Thread.sleep(1000);
		authicon.click();
		Thread.sleep(1000);
		okbtn.click();
		Thread.sleep(1000);	
	}


}
