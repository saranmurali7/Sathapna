package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;
import generic.Excel_Data;

public class DelinkAccountPage extends BaseTest
{
	@FindBy(id="UserCIF_Id__lov")
	private WebElement cifidlov;
	@FindBy(id="NAMEFilter")
	private WebElement namefilter;
	@FindBy(xpath="//*[@id='searchlovval']")
	private WebElement searchlovbtn;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td[2]")
	private WebElement srcres;
	@FindBy(id="btn_icon_icon-search")
	private WebElement srchicn;
	@FindBy(id="delete_button_2_0")
	private WebElement delicn;
	@FindBy(id="popup_cancel")
	private WebElement popupcncl;
	@FindBy(xpath="//*[@id='popup_ok']")
	private WebElement popupok;
	
	
	public DelinkAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public String cifname=Excel_Data.getValue(EXCEL_PATH,"DelinkAccount",1,1).replaceFirst("\\.0+$", "");
	public void Delinkaccount() throws InterruptedException 
	{
		cifidlov.click();
		Thread.sleep(1000);
		namefilter.sendKeys(cifname);
		Thread.sleep(1000);
		searchlovbtn.click();
		Thread.sleep(1000);
		srcres.click();
		Thread.sleep(1000);
		srchicn.click();
		Thread.sleep(1000);
		delicn.click();
		Thread.sleep(1000);
		popupok.click();
		Thread.sleep(1000);
		popupok.click();
		Thread.sleep(1000);
	}

}
