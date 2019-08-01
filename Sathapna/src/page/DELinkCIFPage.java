package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;
import generic.Excel_Data;

public class DELinkCIFPage extends BaseTest
{
	@FindBy(id="CorporateId__lov")
	private WebElement corpidlov;
	@FindBy(id="PREFERRED_CORP_IDFilter")
	private WebElement custidlovfld;
	@FindBy(xpath="//*[@id='searchlovval']")
	private WebElement searchlovbtn;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td[2]")
	private WebElement crpidsrcres;
	@FindBy(id="mapped_CIF__lov")
	private WebElement mapidlovicn;
	@FindBy(id="CIF_NAMEFilter")
	private WebElement cifnamefld;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]")
	private WebElement cifnameres;
	@FindBy(id="Delinkbutton")
	private WebElement delinkbtn;
	@FindBy(xpath="//*[@id='popup_ok']")
	private WebElement popupok;
	public DELinkCIFPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public String custid=Excel_Data.getValue(EXCEL_PATH,"DElinkCIF",1,1).replaceFirst("\\.0+$", "");
	public String cifname=Excel_Data.getValue(EXCEL_PATH,"DElinkCIF",2,1).replaceFirst("\\.0+$", "");
	public void DelinkCIFCreate() throws InterruptedException
	{
		corpidlov.click();
		Thread.sleep(1000);
		custidlovfld.sendKeys(custid);
		Thread.sleep(1000);
		searchlovbtn.click();
		Thread.sleep(1000);
		crpidsrcres.click();
		Thread.sleep(1000);
		mapidlovicn.click();
		Thread.sleep(1000);
		cifnamefld.sendKeys(cifname);
		searchlovbtn.click();
		Thread.sleep(1000);
		cifnameres.click();
		Thread.sleep(1000);
		delinkbtn.click();
		Thread.sleep(1000);
		popupok.click();
		Thread.sleep(1000);
		popupok.click();
		Thread.sleep(1000);

	}

}
