package Master;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;


import Parent.BaseInit;
import Utility.UtilityMethods;

public class BaseInitMaster extends BaseInit{
	
  @BeforeSuite
  public void checkExecutionModeTestSuite() throws IOException {
	  
	  startup();
	  if(!UtilityMethods.checkExecutionModeTestSuite(Test_Suite, "Masters", "TestSuite"))
	  {
		  throw new SkipException("Execution mode of test suite set NO");
	  }
  }
}
