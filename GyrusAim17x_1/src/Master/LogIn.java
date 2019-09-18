package Master;


import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.UtilityMethods;
import Utility.UtilityMethods.operationtype;

public class LogIn extends BaseInitMaster{

	@BeforeTest

	public void CheckTestCaseExecution()
	{

		if(!UtilityMethods.checkExecutionModeTestCase(Test_Cases,this.getClass().getSimpleName(), "Master"))
		{
			throw new SkipException("Execution mode of testcase set No");
		}
	}

	@Test(dataProvider ="getTestData")
	public static void Log_In(String Username, String Password) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.get("https://vipul.gyrusaim.net");
	    UtilityMethods.ExplicitWait_Operation("TXT_USERNAME", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_USERNAME", operationtype.esendkeys, Username, "XPATH");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='password-field']")).sendKeys(Password);
	//	UtilityMethods.ExplicitWait_Operation("TXT_PASSWORD", operationtype.eclear, "", "XPATH");
		//UtilityMethods.ExplicitWait_Operation("TXT_PASSWORD", operationtype.esendkeys, Password, "XPATH"); 
		UtilityMethods.ExplicitWait_Operation("BTN_SING_IN", operationtype.eclick, "", "XPATH"); 
		Thread.sleep(3000);
		System.out.println("Log In Done Succussfully");
	}
	
	@DataProvider(name ="getTestData")
	public Object[][] getTestData()
	{
		return UtilityMethods.getTestDataFromXLS(Test_Data, "LogInData");
	}
	
}
