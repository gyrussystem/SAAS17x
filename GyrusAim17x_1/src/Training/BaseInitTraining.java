package Training;

import Parent.BaseInit;
import Utility.UtilityMethods;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;

public class BaseInitTraining extends BaseInit{
  
  @BeforeSuite
  public void checkExecutionModeTestSuite() throws IOException {
	  
	  startup();
	  if(!UtilityMethods.checkExecutionModeTestSuite(Test_Suite, "Training", "TestSuite"))
	  {
		  throw new SkipException("Execution Mode Of Testsuite Set NO");
	  }
	  
  }

}
