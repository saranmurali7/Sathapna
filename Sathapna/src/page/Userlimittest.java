package page;




import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.glass.events.KeyEvent;

import generic.BaseTest;
import generic.Excel_Data;
public class Userlimittest extends BaseTest
{
	@FindBy(xpath="//*[@id='btn_icon_icon-plus']")
	private WebElement addicn;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div[2]/div/div[2]/ul/li[2]/div/ul/li[2]/a/i")
	private WebElement corpidlovicn;
	@FindBy(xpath="//*[@id='CUSTOMER_IDFilter']")
	private WebElement custidlovfld;
	@FindBy(xpath="//*[@id='searchlovval']")
	private WebElement searchlov;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td[2]")
	private WebElement searchres;
	@FindBy(xpath="//*[@id='tbMbCorpLimitMaster__limitGroupId']")
	private WebElement lmtgrpid;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__initMaxAmount_0']")
	private WebElement depositcreationinitlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__authMaxAmount_0']")
	private WebElement depositcreationauthlimit;

	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__initMaxAmount_1']")
	private WebElement Internationalinitlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__authMaxAmount_1']")
	private WebElement Internationalauthlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__initMaxAmount_2']")
	private WebElement Multitransferinitlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__authMaxAmount_2']")
	private WebElement Multitransferauthlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__initMaxAmount_3']")
	private WebElement Otherinitlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__authMaxAmount_3']")
	private WebElement Otherauthlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__initMaxAmount_4']")
	private WebElement Owninitlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__authMaxAmount_4']")
	private WebElement Ownauthlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__initMaxAmount_5']")
	private WebElement Paymentsinitlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__authMaxAmount_5']")
	private WebElement Paymentsauthlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__initMaxAmount_6']")
	private WebElement Pipayinitlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__authMaxAmount_6']")
	private WebElement Pipayauthlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__initMaxAmount_7']")
	private WebElement Topupinitlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__authMaxAmount_7']")
	private WebElement Topupauthlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__initMaxAmount_8']")
	private WebElement Wingsinitlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__authMaxAmount_8']")
	private WebElement Wingsauthlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__initMaxAmount_9']")
	private WebElement Withininitlimit;
	@FindBy(xpath="//*[@id='tbMbCorpLimitDetails__authMaxAmount_9']")
	private WebElement Withinauthlimit;
	//Save options
	@FindBy(xpath="//*[@id='btn_icon_icon-save']")
	private WebElement saveicon;
	@FindBy(id="popup_ok")
	private WebElement okbtn;

	public Userlimittest(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void UserLimitCreation() throws InterruptedException, AWTException
	{
		String custid=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",1,1).replaceFirst("\\.0+$", "");
		String lmtgrpid1=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",2,1).replaceFirst("\\.0+$", "");
		String dpcrinit=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",3,1).replaceFirst("\\.0+$", "");
		String dpcrauth=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",4,1).replaceFirst("\\.0+$", "");
		String intinit=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",5,1).replaceFirst("\\.0+$", "");
		String intauth=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",6,1).replaceFirst("\\.0+$", "");
		String mulinit=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",7,1).replaceFirst("\\.0+$", "");
		String mulauth=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",8,1).replaceFirst("\\.0+$", "");
		String othinit=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",9,1).replaceFirst("\\.0+$", "");
		String othauth=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",10,1).replaceFirst("\\.0+$", "");
		String owninit=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",11,1).replaceFirst("\\.0+$", "");
		String ownauth=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",12,1).replaceFirst("\\.0+$", "");
		String paymentinit=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",13,1).replaceFirst("\\.0+$", "");
		String paymentauth=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",14,1).replaceFirst("\\.0+$", "");
		String pipayinit=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",15,1).replaceFirst("\\.0+$", "");
		String pipayauth=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",16,1).replaceFirst("\\.0+$", "");
		String topupinit=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",17,1).replaceFirst("\\.0+$", "");
		String topupauth=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",18,1).replaceFirst("\\.0+$", "");
		String wingsinit=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",19,1).replaceFirst("\\.0+$", "");
		String wingsauth=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",20,1).replaceFirst("\\.0+$", "");
		String withininit=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",21,1).replaceFirst("\\.0+$", "");
		String withinauth=Excel_Data.getValue(EXCEL_PATH,"UserLimit Creation",22,1).replaceFirst("\\.0+$", "");
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		addicn.click();
		Thread.sleep(1000);
		corpidlovicn.click();
		Thread.sleep(1000);
		custidlovfld.sendKeys(custid);
		searchlov.click();
		Thread.sleep(1000);
		searchres.click();
		Thread.sleep(1000);
		lmtgrpid.sendKeys(lmtgrpid1);
		Thread.sleep(1000);
		/*
		ArrayList<WebElement>Elmnts=new ArrayList<WebElement>();
		Elmnts.add(Internationalinitlimit);
		Elmnts.add(Internationalauthlimit);
		
		ArrayList<String>literals=new ArrayList<String>();
		literals.add(intinit);
		literals.add(intauth);
		
		for(int i=0;i<Elmnts.size();i++)
		{
			Elmnts.clear();
			Thread.sleep(1000);
			Elmnts.
		}
		*/
		//WebElement[] Elmnts = new WebElement[2];
		//String[] literals = new String[2];
		/*
		WebElement[] Elmnts = {Internationalinitlimit,Internationalauthlimit,Multitransferinitlimit,Multitransferauthlimit,
				Otherinitlimit,Otherauthlimit,Owninitlimit,Ownauthlimit,Paymentsinitlimit,Paymentsauthlimit,Pipayinitlimit,
				Pipayauthlimit,Topupinitlimit,Topupauthlimit,Wingsinitlimit,Wingsauthlimit,Withininitlimit,Withinauthlimit,
				depositcreationinitlimit,depositcreationauthlimit,};
		String[] literals = {intinit,intauth,mulinit,mulauth,othinit,othauth,owninit,ownauth,paymentinit,paymentauth,
				pipayinit,pipayauth,topupinit,topupauth,wingsinit,wingsauth,withininit,withinauth,dpcrinit,dpcrauth};
				

		//for(int i=0;i<Elmnts.length;i++)
		for(int i=0;i<1;i++)
		{
			Elmnts[i].clear();
			Thread.sleep(1000);
			Elmnts[i].sendKeys(literals[i]);
		}
		*/
		
		depositcreationinitlimit.clear();
		depositcreationinitlimit.sendKeys(dpcrinit);
		Thread.sleep(1000);
		depositcreationauthlimit.clear();
		depositcreationauthlimit.sendKeys(dpcrauth);
		Thread.sleep(1000);
		Internationalinitlimit.clear();
		Internationalinitlimit.sendKeys(intinit);
		Thread.sleep(1000);
		Internationalauthlimit.clear();
		Internationalauthlimit.sendKeys(intauth);
		Thread.sleep(1000);
		Multitransferinitlimit.clear();
		Multitransferinitlimit.sendKeys(mulinit);
		Thread.sleep(1000);
		Multitransferauthlimit.clear();
		Multitransferauthlimit.sendKeys(mulauth);
		/*
		Thread.sleep(1000);
		Otherinitlimit.clear();
		Otherinitlimit.sendKeys(othinit);
		Thread.sleep(1000);
		Otherauthlimit.clear();
		Otherauthlimit.sendKeys(othauth);
		Thread.sleep(1000);
		Owninitlimit.clear();
		Owninitlimit.sendKeys(owninit);
		Thread.sleep(1000);
		Ownauthlimit.clear();
		Ownauthlimit.sendKeys(ownauth);
		Thread.sleep(1000);
		Paymentsinitlimit.clear();
		Paymentsinitlimit.sendKeys(paymentinit);
		Thread.sleep(1000);
		Paymentsauthlimit.clear();
		Paymentsauthlimit.sendKeys(paymentauth);
		Thread.sleep(1000);
		Pipayinitlimit.clear();
		Pipayinitlimit.sendKeys(pipayinit);
		Thread.sleep(1000);
		Pipayauthlimit.clear();
		Pipayauthlimit.sendKeys(pipayauth);
		Thread.sleep(1000);
		Topupinitlimit.clear();
		Topupinitlimit.sendKeys(topupinit);
		Thread.sleep(1000);
		Topupauthlimit.clear();
		Topupauthlimit.sendKeys(topupauth);
		Thread.sleep(1000);
		Wingsinitlimit.clear();
		Wingsinitlimit.sendKeys(wingsinit);
		Thread.sleep(1000);
		Wingsauthlimit.clear();
		Wingsauthlimit.sendKeys(wingsauth);
		Thread.sleep(1000);
		Withininitlimit.clear();
		Withininitlimit.sendKeys(withininit);
		Thread.sleep(1000);
		Withinauthlimit.clear();
		Withinauthlimit.sendKeys(withinauth);
		Thread.sleep(1000);
		
		*/
		
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//js.executeScript("arguments[0].scrollIntoView(true);",lmtgrpid);
		//driver.findElement(By.id("lmtgrpid")).sendKeys(Keys.PAGE_UP);
		/*
		Robot R1=new Robot();
		R1.keyPress(KeyEvent.VK_UP);
		Thread.sleep(2000);
		R1.keyRelease(KeyEvent.VK_UP);
		*/
		Thread.sleep(2000);
		saveicon.click();
		//Thread.sleep(1000);
		okbtn.click();
		Thread.sleep(1000);
	
		
		
	}

}
