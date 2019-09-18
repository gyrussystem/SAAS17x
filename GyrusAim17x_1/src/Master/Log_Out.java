package Master;

import org.testng.annotations.Test;

import Utility.UtilityMethods;
import Utility.UtilityMethods.operationtype;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;

public class Log_Out extends BaseInitMaster{
 
  @BeforeTest
  public void CheckTestCaseExecution() {
	  
	  if(!UtilityMethods.checkExecutionModeTestCase(Test_Cases, this.getClass().getSimpleName(), "Master"))
	  {
		  throw new SkipException("Execution mode of testcase set No");
	  }
  }
  
  @Test
  public static void Logout() throws InterruptedException {
	  
	  Thread.sleep(5000);
	  UtilityMethods.ExplicitWait_Operation("BTN_LOGOUT", operationtype.eclick, "", "XPATH");
	  System.out.println("Logout Done Succussfully");
	  
  }

}
