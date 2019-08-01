package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import generic.BaseTest;
import generic.Excel_Data;

public class LoginPage extends BaseTest
{
	@FindBy(id="login_input__user_id")
	private WebElement userid;
	@FindBy(id="login_input__password")
	private WebElement password;
	@FindBy(id="element_button_1")
	private WebElement Loginbtn;
	@FindBy(id="popup_ok")
	private WebElement ConfOK;

    //Pop-up messages
	@FindBy(id="popup_message")
	private WebElement popupmsg;

	

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}

	public void validLogin(String un,String pwd) throws InterruptedException
	{
		userid.sendKeys(un);
		password.sendKeys(pwd);
		Loginbtn.click();

		Thread.sleep(2000);
		//ConfOK.click();
		//isAlertPresent();
	}
	public void Loginblank() throws InterruptedException 
	{
		String un=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",1,2);
		String pw=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",1,3);
		String experror=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",1,4);
		userid.sendKeys(un);
		password.sendKeys(pw);
		Loginbtn.click();
		String abserr=popupmsg.getText();
		Thread.sleep(1000);
		ConfOK.click();
		System.out.println(abserr);
		Reporter.log(abserr);
		Assert.assertEquals(abserr,experror);
	}

	public void Loginuseridblank() throws InterruptedException 
	{
		String un=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",2,2);
		String pw=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",2,3);
		String experror=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",2,4);
		userid.sendKeys(un);
		password.sendKeys(pw);
		Loginbtn.click();
		String abserr=popupmsg.getText();
		Thread.sleep(1000);
		ConfOK.click();
		System.out.println(abserr);
		Reporter.log(abserr);
		Assert.assertEquals(abserr,experror);
	}

	public void Loginpwdblank() throws InterruptedException 
	{
		String un=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",3,2);
		String pw=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",3,3);
		String experror=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",3,4);
		userid.sendKeys(un);
		password.sendKeys(pw);
		Loginbtn.click();
		String abserr=popupmsg.getText();
		Thread.sleep(1000);
		ConfOK.click();
		System.out.println(abserr);
		Reporter.log(abserr);
		Assert.assertEquals(abserr,experror);
	}
	public void Logininvuserid() throws InterruptedException 
	{
		String un=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",4,2);
		String pw=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",4,3);
		String experror=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",4,4);
		userid.sendKeys(un);
		password.sendKeys(pw);
		Loginbtn.click();
		String abserr=popupmsg.getText();
		Thread.sleep(1000);
		ConfOK.click();
		System.out.println(abserr);
		Reporter.log(abserr);
		Assert.assertEquals(abserr,experror);
	}
	public void Logininvpwd() throws InterruptedException 
	{
		String un=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",5,2);
		String pw=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",5,3);
		String experror=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",5,4);
		userid.sendKeys(un);
		password.sendKeys(pw);
		Loginbtn.click();
		String abserr=popupmsg.getText();
		Thread.sleep(1000);
		ConfOK.click();
		System.out.println(abserr);
		Reporter.log(abserr);
		Assert.assertEquals(abserr,experror);
	}
	public void Logininvusridpwd() throws InterruptedException 
	{
		String un=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",6,2);
		String pw=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",6,3);
		String experror=Excel_Data.getValue(EXCEL_PATH,"Invalid Login",6,4);
		userid.sendKeys(un);
		password.sendKeys(pw);
		Loginbtn.click();
		String abserr=popupmsg.getText();
		Thread.sleep(1000);
		ConfOK.click();
		System.out.println(abserr);
		Reporter.log(abserr);
		Assert.assertEquals(abserr,experror);
	}
	

	/*
public boolean isAlertPresent() 
{ 
    try 
    { 
        driver.switchTo().alert(); 
        ConfOK.click();
        return true; 
    }   // try 
    catch (org.openqa.selenium.NoAlertPresentException Ex) 
    { 
        return false; 
    }   // catch 
}   // isAlertPresent()


	 */





}



