package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.AutoUtils;
import generic.BaseTest;

public class DashboardPage extends BaseTest
{
@FindBy(xpath="//*[@id='btn_icon_icon-signout']")
private WebElement logouticn;
@FindBy(id="popup_ok")
private WebElement logoutcnfOK;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/div/div/div/div/ul/li[1]/a")
private WebElement Maintainenceicn;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/div/div/div/div/ul/li[1]/ul/li[3]/a")
private WebElement BankAdminCreatelink;
//Corporate Registration Icon
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/div/div/div/div/ul/li[2]/a")
private WebElement Cotpmainicn;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/div/div/div/div/ul/li[2]/ul/li[1]/a")
private WebElement corpreglink;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/div/div/div/div/ul/li[2]/ul/li[2]/a")
private WebElement corpworkgroup;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/div/div/div/div/ul/li[2]/ul/li[3]/a")
private WebElement userregistration;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/div/div/div/div/ul/li[2]/ul/li[9]/a")
private WebElement userlimitcreation;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/div/div/div/div/ul/li[2]/ul/li[4]/a")
private WebElement mapwrkgrp;
@FindBy(xpath="//*[@id='menu_icon-user ']")
private WebElement menuusr;
@FindBy(xpath="//a[contains(text(),'CIF Account Mapping')]")
private WebElement cifaccmaplink;

@FindBy(xpath="/html/body/div[2]/div[2]/div/div[1]/div/div/div/div/div/div/ul/li[3]/ul/li[1]/a")
private WebElement entitycifmapping;

@FindBy(xpath="//li[@id='De-Link CIF_li']//a[contains(text(),'De-Link CIF')]")
private WebElement delinkCIF;

@FindBy(xpath="//a[contains(text(),'De-Link Account')]")
private WebElement delinkacc;

public DashboardPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

public void logout() throws InterruptedException
{
	logouticn.click();
	logoutcnfOK.click();
	Thread.sleep(1000);
}

public void BankAdminNavigate() throws InterruptedException
{
	//long ITO1 = Long.parseLong(AutoUtils.getProperty(CONFIG_PATH, "ITO"));
	//WebDriverWait wait = new WebDriverWait(driver,ETO1);
	//Maintainenceicn=wait.until(ExpectedConditions.visibilityOf(Maintainenceicn));
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(10000);
	Maintainenceicn.click();
	Thread.sleep(1000);
	BankAdminCreatelink.click();
	
}

public void CorporateRegistrationNavigate() throws InterruptedException 
{
	Thread.sleep(10000);
	Cotpmainicn.click();
	Thread.sleep(1000);
	corpreglink.click();
}

public void CorpWorkGroupNavigate() throws InterruptedException 
{
	Thread.sleep(10000);
	Cotpmainicn.click();
	Thread.sleep(1000);
	corpworkgroup.click();	
}
public void UserRegNavigate() throws InterruptedException 
{
	Thread.sleep(10000);
	Cotpmainicn.click();
	Thread.sleep(1000);
	userregistration.click();
}

public void UserLimitNavigate() throws InterruptedException
{
	Thread.sleep(10000);
	Cotpmainicn.click();
	Thread.sleep(1000);
	userlimitcreation.click();
		
}

public void mapWorkgroupNavigate() throws InterruptedException 
{
	Thread.sleep(10000);
	Cotpmainicn.click();
	Thread.sleep(1000);
	mapwrkgrp.click();
	
	
}

public void EntityCIFMappingNavigate() throws InterruptedException 
{
	Thread.sleep(10000);
	menuusr.click();
	Thread.sleep(1000);
	entitycifmapping.click();
}
public void CIFAccountMappingNavigate() throws InterruptedException 
{
	Thread.sleep(10000);
	menuusr.click();
	Thread.sleep(1000);
	cifaccmaplink.click();
}

public void DelinkCIFNavigate() throws InterruptedException 
{
	Thread.sleep(10000);
	menuusr.click();
	Thread.sleep(1000);
	delinkCIF.click();
	
	
}

public void DeLinkAccountNavigate() throws InterruptedException
{
	Thread.sleep(10000);
	menuusr.click();
	Thread.sleep(1000);
	delinkacc.click();
}



}
