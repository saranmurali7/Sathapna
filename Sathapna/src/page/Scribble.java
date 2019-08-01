package page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.reporters.jq.Main;

public class Scribble 
{
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver");
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("http://192.168.6.28:8080/SPNCorporateAdmin/");
		WebDriverWait wait = new WebDriverWait(driver,40);
		WebElement userid;
		userid=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_input__user_id")));
		
		userid.sendKeys("satya123");
		driver.findElement(By.id("login_input__password")).sendKeys("Admin@123");
		driver.findElement(By.id("element_button_1")).click();
		/*
		Thread.sleep(8000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div/div/div/div/div/div/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div/div/div/div/div/div/ul/li[1]/ul/li[3]/a")).click();
		Thread.sleep(2000);
	    driver.findElement(By.id("btn_icon_icon-plus")).click();
	    Thread.sleep(2000);
	    Workbook wb=WorkbookFactory.create(new FileInputStream("./Input_Data/Inputs.xlsx"));
		String v=wb.getSheet("BankAdminData").getRow(1).getCell(1).toString();
	    driver.findElement(By.id("tbAsmiUser__userId")).sendKeys(v);
	    */
		Thread.sleep(4000);
		driver.findElement(By.id("/html/body/div[2]/div[2]/div/div[1]/div/div/div/div/div/div/ul/li[2]/a")).click();
		driver.findElement(By.id("/html/body/div[2]/div[2]/div/div[1]/div/div/div/div/div/div/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.id("btn_icon_icon-plus")).click();
		driver.findElement(By.id("Custcorp__INCORPDT")).click();
		
	    
	    
	}
	

}
