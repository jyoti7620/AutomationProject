package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LoginPage {
 
//Declaration
@FindBy(xpath="//span[text()='Hello. Sign in']")
private WebElement clk;

@FindBy(id="ap_email")
private WebElement Uname;

@FindBy(id="continue")
private WebElement contibtn;

@FindBy(id="ap_password")
private WebElement pwTB;

@FindBy(id="signInSubmit")
private WebElement login;



//Initialization

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

//Utilization

public void clickLogin() {
	clk.click();
}
public void setUserName(String un) {
	Uname.sendKeys(un);
	
}

public void clickContinue() {
	contibtn.click();
}
  
public void setPassword(String pw) {
	pwTB.sendKeys(pw);
}
public void clickLogin1() {
	login.click();
}


}