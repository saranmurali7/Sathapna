package page;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.glass.events.KeyEvent;

import generic.BaseTest;
import generic.Excel_Data;

public class UserProfiledetailPage extends BaseTest
{
	@FindBy(xpath="//*[@id='btn_icon_icon-plus']")
	private WebElement addicn;
	
	@FindBy(xpath="//*[@id='admin_box']")
	private WebElement usertypeSTP;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div[3]/div[1]/div[6]/div/div/ul/li[2]/div/ul/li[2]/a/i")
	private WebElement crpidlovicn;
	@FindBy(xpath="//*[@id='PREFERRED_CORP_IDFilter']")
	private WebElement crpidlovfld;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td[2]")
	private WebElement crpidsrchres;
	@FindBy(xpath="//*[@id='tbAsmiUser__userId']")
	private WebElement userid;
	@FindBy(xpath="//*[@id='tbAsmiUser__userName']")
	private WebElement username;
	@FindBy(xpath="//*[@id='tbAsmiUser__userPhno1']")
	private WebElement mobilenum;
	@FindBy(xpath="//*[@id='tbAsmiUser__userEml1']")
	private WebElement emailid;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[2]/div/div[1]/div/ul/li[1]/div/a[1]/i")
	private WebElement rolesaddicn;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[2]/div/div[2]/table/tbody/tr/td[2]/div/ul/li[2]/a/i")
	private WebElement roleslov;
	@FindBy(xpath="//*[@id='ROLE_IDFilter']")
	private WebElement roleidlov;
	@FindBy(xpath="//*[@id='searchlovval']")
	private WebElement searchlov;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td")
	private WebElement rolesrchreslov;
	@FindBy(xpath="//*[@id='btn_icon_icon-save']")
	private WebElement saveicn;
	@FindBy(id="popup_ok")
	private WebElement okbtn;

	public UserProfiledetailPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
	
	public void UserProfileCreation() throws InterruptedException, AWTException 
	{
		addicn.click();
		Thread.sleep(2000);
		String corpid=Excel_Data.getValue(EXCEL_PATH,"User Registration",1,1).replaceFirst("\\.0+$", "");
		String usrid=Excel_Data.getValue(EXCEL_PATH,"User Registration",2,1).replaceFirst("\\.0+$", "");
		String usrname=Excel_Data.getValue(EXCEL_PATH,"User Registration",3,1);
		String mobnum=Excel_Data.getValue(EXCEL_PATH,"User Registration",4,1).replaceFirst("\\.0+$", "");
		String emailid1=Excel_Data.getValue(EXCEL_PATH,"User Registration",5,1);
		String roleid=Excel_Data.getValue(EXCEL_PATH,"User Registration",6,1);
		usertypeSTP.click();
		Thread.sleep(1000);
		crpidlovicn.click();
		Thread.sleep(1000);
		crpidlovfld.sendKeys(corpid);
		searchlov.click();
		crpidsrchres.click();
		Thread.sleep(1000);
		userid.sendKeys(usrid);
		Thread.sleep(1000);
		username.sendKeys(usrname);
		Thread.sleep(1000);
		mobilenum.sendKeys(mobnum);
		Thread.sleep(1000);
		emailid.sendKeys(emailid1);
		Thread.sleep(1000);
		rolesaddicn.click();
		Thread.sleep(1000);
		roleslov.click();
		roleidlov.sendKeys(roleid);
		searchlov.click();
		rolesrchreslov.click();
		Thread.sleep(2000);
		Robot R1=new Robot();
		R1.keyPress(KeyEvent.VK_UP);
		Thread.sleep(1000);
		R1.keyRelease(KeyEvent.VK_UP);
		saveicn.click();
		Thread.sleep(1000);
		okbtn.click();
		Thread.sleep(1000);
	}

	

	
	
}
