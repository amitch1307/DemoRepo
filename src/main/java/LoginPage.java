/**
 * 
 */


import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/**
 * @author Prashsti Amit ji
 *
 *This class will store all the locators and methods of login page
 *
 */
public class LoginPage {
	
	WebDriver driver;
	
	
		By  username= By.xpath("//*[@name='m_LoginControl$UserName']");
		By  password= By.name("m_LoginControl$Password");
		By  loginbutton   = By.xpath("//*[@id='m_LoginControl_lnkTest']");		
	
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void typeusername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	public void typepassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickonloginbutton()
	{
		driver.findElement(loginbutton).click();
	}
	
	public void LoginAlis(String uname, String pwd){
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginbutton).click();
	}
	}

