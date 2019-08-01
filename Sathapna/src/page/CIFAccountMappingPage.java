package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;
import generic.Excel_Data;

public class CIFAccountMappingPage extends BaseTest
{
	@FindBy(xpath="//*[@id='btn_icon_icon-plus']")
	private WebElement addicn;
	@FindBy(css="#userCIF__userID__lov > .icon-list")
	private WebElement ciflovicn;
	@FindBy(id="NAMEFilter")
	private WebElement cifnamefld;
	@FindBy(xpath="//*[@id='searchlovval']")
	private WebElement searchlov;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td[1]")
	private WebElement cifres;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/ul/li[1]/div/a[1]/i")
	private WebElement childCIFaddicn;
	@FindBy(css=".vtop > .icon-list")
	private WebElement childciflovicn;
	@FindBy(css=".tablecontainer tr:nth-child(1) > td:nth-child(3)")
	private WebElement childcifres;
	@FindBy(xpath="//*[@id='btn_icon_icon-save']")
	private WebElement saveicn;
	@FindBy(xpath="//*[@id='popup_ok']")
	private WebElement popupok;
	@FindBy(xpath="//*[@id='btn_icon_icon-search']")
	private WebElement searchicn;
	@FindBy(xpath="//a[@id='apzvwCifAccountsMappedSum__cifId_0']")
	private WebElement mapres;
	@FindBy(xpath="//*[@id='btn_icon_icon-ok']")
	private WebElement authicon;
	@FindBy(id="popup_ok")
	private WebElement okbtn;
	@FindBy(id="UserCIF_Id__lov")
	WebElement ciflovicn1;
			
	public CIFAccountMappingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
	//public String custid=Excel_Data.getValue(EXCEL_PATH,"CIFAccMapping",1,1).replaceFirst("\\.0+$", "");
	public String cifname=Excel_Data.getValue(EXCEL_PATH,"CIFAccMapping",1,1).replaceFirst("\\.0+$", "");

	public void CIFAccountmappingCreate() throws InterruptedException
	{
		addicn.click();
		Thread.sleep(1000);
		ciflovicn.click();
		Thread.sleep(1000);
		cifnamefld.sendKeys(cifname);
		searchlov.click();
		cifres.click();
		Thread.sleep(1000);
		childCIFaddicn.click();
		Thread.sleep(1000);
		childciflovicn.click();
		Thread.sleep(1000);
		childcifres.click();
		Thread.sleep(1000);
		saveicn.click();
		Thread.sleep(1000);
		popupok.click();
		Thread.sleep(1000);
	}
	public void CIFAccountmappingAuthorize() throws InterruptedException
	{
		
		ciflovicn1.click();
		Thread.sleep(1000);
		cifnamefld.sendKeys(cifname);
		searchlov.click();
		cifres.click();
		Thread.sleep(1000);
		searchicn.click();
		Thread.sleep(1000);
		mapres.click();
		Thread.sleep(1000);
		authicon.click();
		Thread.sleep(1000);
		okbtn.click();
		Thread.sleep(1000);
	}


}
