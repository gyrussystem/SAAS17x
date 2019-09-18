package Training;

import org.testng.annotations.Test;

import Training_Functionality.Training_Info;
import Training_Functionality.Training_Objective;
import Utility.UtilityMethods;
import Utility.UtilityMethods.operationtype;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class eLearning extends BaseInitTraining	{

	@BeforeTest
	public void checkTestCaseExecution() {

		if(!UtilityMethods.checkExecutionModeTestCase(Test_Cases, this.getClass().getSimpleName(), "Training"))
		{
			throw new SkipException("Execution Mode Of Testcase Set NO");
		}

	}
	@Test(dataProvider ="Training_Data")
	public static void eLearning_Training(String T_name, String T_Code, String TGRP_SER, String URL, String T_Hour, String T_SER_VENDOR, String T_COM_HR, String goal, String summary, String note) throws InterruptedException, IOException, AWTException 
	{

		Thread.sleep(10000);
		UtilityMethods.ExplicitWait_Operation("BTN_ADD_TRAINING", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_e_Learing", operationtype.eclick, "", "XPATH");
		Thread.sleep(10000);
		Training_Info.Training_Details(T_name, T_Code, TGRP_SER, URL, T_Hour, T_SER_VENDOR, T_COM_HR, goal, summary, note);
		Thread.sleep(7000);
		Training_Objective.Training_OBJ();

	}

	@DataProvider(name = "Training_Data")
	public Object[][] getTestData()
	{
		return UtilityMethods.getTestDataFromXLS(Test_Data, "Training_Data");
	}
	

}
