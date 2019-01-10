package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.LoginPage;

public class ValidLogin extends BaseTest
{
	
@Test(priority=1)
public void testValidLogin() {
	String un=FWUtil.getXLData(XL_PATH, "ValidLogin", 1, 0);
    String pw=FWUtil.getXLData(XL_PATH, "ValidLogin", 1, 1);
 	
	// Enter valid user name
	LoginPage l=new LoginPage(driver);
	l.clickLogin();
	l.setUserName(un);
	l.clickContinue();
    l.setPassword(pw);
    l.clickLogin1();
	
	//Verifiy home page is displayed


	
}


}
