

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {

	WebDriver driver;
	// what is the web driver we will receive directly pass here
	// (WebDriver ldriver) this driver come from page factory , what erver driver come from page factory 
	// + we will initialize to local driver 
	public LoginPageNew(WebDriver ldriver)
	{
		this.driver= ldriver;
	}
	
	@FindBy(name="m_LoginControl$UserName")
	WebElement username;
	
	@FindBy (how=How.NAME,using="m_LoginControl$Password") // how is class, name is the seprate static variable
	WebElement password;
	
	@FindBy(how= How.XPATH,using="//*[@id='m_LoginControl_lnkTest']")
	WebElement loginAlis;
	
	
	public void logintoalis(String uname,String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginAlis.click();
	}
	
}

