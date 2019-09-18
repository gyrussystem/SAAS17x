package Training;

import org.testng.annotations.Test;

import Utility.UtilityMethods;
import Utility.UtilityMethods.operationtype;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;

public class ILT extends BaseInitTraining{
 
  @BeforeTest
  public void CheckTestCaseExecution() {
	  
	  if(!UtilityMethods.checkExecutionModeTestCase(Test_Cases, this.getClass().getSimpleName(), "Training"))
	  {
		  throw new SkipException("Execution Mode Test Case Set No");
	  }
	  
  }
  @Test
  public void ILT_Training() throws InterruptedException {
	  
	  Thread.sleep(10000);
	  UtilityMethods.ExplicitWait_Operation("BTN_ADD_TRAINING", operationtype.eclick, "", "XPATH");
	  UtilityMethods.ExplicitWait_Operation("BTN_ILT", operationtype.eclick, "", "XPATH");
	  
  }

}
