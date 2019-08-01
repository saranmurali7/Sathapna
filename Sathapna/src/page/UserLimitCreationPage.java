package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;
import generic.Excel_Data;

public class UserLimitCreationPage extends BaseTest
{
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div[2]/div[1]/div[1]/ul/li[2]/div/ul/li[2]/a/i")
	private WebElement corpidlovicn;
	@FindBy(xpath="//*[@id='CUSTOMER_IDFilter']")
	private WebElement custidlovfld;
	@FindBy(xpath="//*[@id='searchlovval']")
	private WebElement searchlovbtn;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td[2]")
	private WebElement crpidsrcres;
	@FindBy(xpath="//*[@id='btn_icon_icon-search']")
	private WebElement searchicn;
	@FindBy(xpath="//*[@id='tbMbCorpLimitMaster__limitGroupId_0']")
	private WebElement usrlimitqueryres;
	@FindBy(xpath="//*[@id='btn_icon_icon-ok']")
	private WebElement authicon;
	@FindBy(id="popup_ok")
	private WebElement okbtn;
	
	
	public UserLimitCreationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void UserLimitAuthorization() throws InterruptedException
	{
		
		String custid=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",1,1).replaceFirst("\\.0+$", "");
		corpidlovicn.click();
		Thread.sleep(1000);
		custidlovfld.sendKeys(custid);
		Thread.sleep(1000);
		searchlovbtn.click();
		Thread.sleep(1000);
		crpidsrcres.click();
		Thread.sleep(1000);
		searchicn.click();
		Thread.sleep(1000);
		usrlimitqueryres.click();
		Thread.sleep(1000);
		authicon.click();
		Thread.sleep(1000);
		okbtn.click();
		Thread.sleep(1000);
	}

}
