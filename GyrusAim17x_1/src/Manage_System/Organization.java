package Manage_System;

import org.testng.annotations.Test;

import Utility.UtilityMethods;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;

public class Organization extends BaseInitManageSystem {
 
  
  @BeforeTest
  public void CheckTestCaseExecution() {
	 
	 if(!UtilityMethods.checkExecutionModeTestCase(Test_Cases, this.getClass().getSimpleName(), "Manage_System"))
	 {
		 throw new SkipException("Execution mode of testcase set No");
	 }
  }

  @Test
  public void f() {
  }
}
