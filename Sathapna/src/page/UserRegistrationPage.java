package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;
import generic.Excel_Data;

public class UserRegistrationPage extends BaseTest
{
	@FindBy(xpath="//*[@id='btn_icon_icon-plus']")
	private WebElement addicn;
	@FindBy(xpath="//*[@id='userId']")
	private WebElement useridfld;
	@FindBy(xpath="//*[@id='btn_icon_icon-search']")
	private WebElement srchicn;
	@FindBy(xpath="//*[@id='tbAsmiUser__userId_0']")
	private WebElement usrqueryres;
	@FindBy(xpath="//*[@id='btn_icon_icon-ok']")
	private WebElement authicon;
	@FindBy(id="popup_ok")
	private WebElement okbtn;
	public UserRegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
	
	
	public void UserProfileAuthorization() throws InterruptedException 
	{
		String usrid=Excel_Data.getValue(EXCEL_PATH,"User Registration",2,1).replaceFirst("\\.0+$", "");
		useridfld.sendKeys(usrid);
		Thread.sleep(1000);
		srchicn.click();
		Thread.sleep(1000);
		usrqueryres.click();
		Thread.sleep(4000);
		authicon.click();
		Thread.sleep(1000);
		okbtn.click();
		Thread.sleep(1000);
	}
}
