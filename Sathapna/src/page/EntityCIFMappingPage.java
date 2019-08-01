package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;
import generic.Excel_Data;

public class EntityCIFMappingPage extends BaseTest
{
	@FindBy(id="CorporateId__lov")
	private WebElement corpidlovicn;
	@FindBy(id="PREFERRED_CORP_IDFilter")
	private WebElement custidlovfld;
	@FindBy(xpath="//*[@id='searchlovval']")
	private WebElement searchlovbtn;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td[2]")
	private WebElement crpidsrcres;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/ul/li[1]/div/a[1]/i")
	private WebElement childCIFaddicn;
	@FindBy(css=".vtop > .icon-list")
	private WebElement childciflovicn;
	@FindBy(id="NAMEFilter")
	private WebElement cifnamefld;
	@FindBy(xpath="//*[@id='searchlovval']")
	private WebElement searchlov;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td[1]")
	private WebElement cifres;
	@FindBy(xpath="//*[@id='btn_icon_icon-save']")
	private WebElement saveicn;
	@FindBy(xpath="//*[@id='popup_ok']")
	private WebElement popupok;
	@FindBy(xpath="//*[@id='btn_icon_icon-plus']")
	private WebElement addicn;
	@FindBy(id="btn_icon_icon-search")
	private WebElement srchicn;
	@FindBy(id="apzvwEntityCifMappedSum__corpEntity_0")
	private WebElement srcresentmap;
	@FindBy(id="tbMbEntityCifMapping__cifName_0")
	private WebElement csnamecheck;
	@FindBy(xpath="//*[@id='btn_icon_icon-ok']")
	private WebElement authicon;
	public EntityCIFMappingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
	public String custid=Excel_Data.getValue(EXCEL_PATH,"Entity CIF Mapping",1,1).replaceFirst("\\.0+$", "");
	public String cifname=Excel_Data.getValue(EXCEL_PATH,"Entity CIF Mapping",2,1).replaceFirst("\\.0+$", "");

	
	public void EntityCIFMappingCreate() throws InterruptedException
	{
		
		addicn.click();
		Thread.sleep(1000);
		corpidlovicn.click();
		Thread.sleep(1000);
		custidlovfld.sendKeys(custid);
		searchlovbtn.click();
		crpidsrcres.click();
		Thread.sleep(1000);
		childCIFaddicn.click();
		Thread.sleep(1000);
		childciflovicn.click();
		Thread.sleep(1000);
		cifnamefld.sendKeys(cifname);
		searchlov.click();
		cifres.click();
		Thread.sleep(1000);
		saveicn.click();
		Thread.sleep(1000);
		popupok.click();
		Thread.sleep(1000);
	}

	public void EntityCIFMappingCheck() throws InterruptedException 
	{
		corpidlovicn.click();
		Thread.sleep(1000);
		custidlovfld.sendKeys(custid);
		searchlovbtn.click();
		crpidsrcres.click();
		Thread.sleep(1000);
		srchicn.click();
		Thread.sleep(1000);
		srcresentmap.click();
		Thread.sleep(1000);
		String text=csnamecheck.getText();
		System.out.println(text);
		Thread.sleep(1000);
	}

	public void EntityCIFMappingAuthorize() throws InterruptedException 
	{
		corpidlovicn.click();
		Thread.sleep(1000);
		custidlovfld.sendKeys(custid);
		searchlovbtn.click();
		crpidsrcres.click();
		Thread.sleep(1000);
		srchicn.click();
		Thread.sleep(1000);
		srcresentmap.click();
		Thread.sleep(1000);
		authicon.click();
		Thread.sleep(1000);
		popupok.click();
		Thread.sleep(1000);
	}

}
