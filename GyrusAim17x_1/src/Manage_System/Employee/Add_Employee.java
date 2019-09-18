package Manage_System.Employee;

import org.testng.annotations.Test;

import Manage_System.Assign_Operation;
import Manage_System.BaseInitManageSystem;
import Utility.UtilityMethods;
import Utility.UtilityMethods.operationtype;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Add_Employee extends BaseInitManageSystem{

	@BeforeTest
	public void CheckTestCaseExecution() 
	{

		if(!UtilityMethods.checkExecutionModeTestCase(Test_Cases, this.getClass().getSimpleName(), "Manage_System"))
		{
			throw new SkipException("Execution mode of testcase set No");
		}
	}

	@Test(dataProvider="Testdata" , priority=1)
	public void Adding_Employee(String Emp_Number, String FirstName, String MiddleName, String LastName, String Email, String WindowName, String National_Ref, String Title, String Prfix, String Suffix, String RecordPerPage, String Address1, String Address2, String City, String State, String P_Code, String Country, String Number, String Num_Type, CharSequence Notes ) throws InterruptedException 
	{

		Thread.sleep(7000);
		driver.findElement(By.xpath(".//*[@ng-click='openView(enuMenu.Employee_Add)']")).click();
		System.out.println("==>ADD EMPLOYEE FUNCTIONALITY START..... ");
		Employee_Personal_Info(Emp_Number, FirstName, MiddleName, LastName, Email, WindowName, National_Ref, Title, Prfix, Suffix, RecordPerPage, Address1, Address2, City, State, P_Code, Country, Number, Num_Type, Notes);
		UtilityMethods.ExplicitWait_Operation("BTN_NEXT_EMPLOYEE", operationtype.eclick, "", "XPATH");
		Thread.sleep(5000);
		Assign_Operation.Employee_Assignment();
		Assign_Operation.Employee_Advance_Assignment();
		//		UtilityMethods.ExplicitWait_Operation("BTN_PREVIOUS", operationtype.eclick, "", "XPATH");
		//		UtilityMethods.ExplicitWait_Operation("BTN_PREVIOUS", operationtype.eclick, "", "XPATH");
		//		UtilityMethods.ExplicitWait_Operation("BTN_PREVIOUS", operationtype.eclick, "", "XPATH");
		//		UtilityMethods.ExplicitWait_Operation("BTN_NEXT_EMPLOYEE", operationtype.eclick, "", "XPATH");
		//		UtilityMethods.ExplicitWait_Operation("BTN_NEXT_EMPLOYEE", operationtype.eclick, "", "XPATH");
		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("BTN_NEXT_EMPLOYEE", operationtype.eclick, "", "XPATH");
		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("BTN_SAVE_EXIT", operationtype.eclick, "", "XPATH");
		System.out.println("==>ADD EMPLOYEE FUNCTIONALITY COMPLETED..... ");
	}

	public static void Employee_Personal_Info(String Emp_Number, String FirstName, String MiddleName, String LastName, String Email, String WindowName, String National_Ref, String Title, String Prfix, String Suffix, String RecordPerPage, String Address1, String Address2, String City, String State, String P_Code, String Country, String Number, String Num_Type, CharSequence Notes ) throws InterruptedException 
	{

		Thread.sleep(15000);
		UtilityMethods.ExplicitWait_Operation("TXT_EMP_NO", operationtype.esendkeys, Emp_Number, "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_EMP_NAME", operationtype.esendkeys, FirstName, "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_EMP_MIDDLE_NAME", operationtype.esendkeys,MiddleName, "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_LAST_NAME", operationtype.esendkeys,  LastName, "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_EMAIL", operationtype.esendkeys, Email, "XPATH");
		WebElement Element = driver.findElement(By.xpath("//input[@id='txtGyrusUserModel_UserName']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("BTN_SHOW_MORE",operationtype.eclick, "", "XPATH");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='Default_DateFormatId']//*[@class='md-select-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'DD/MM/YYYY')]")).click();
		UtilityMethods.ExplicitWait_Operation("TXT_WIN_USER", operationtype.esendkeys, WindowName, "XPATH");
		UtilityMethods.ExplicitWait_Operation("DE_A_CALENDER", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SEL_DEL_DATE", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("HIRE_CALENDER", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SEL_HIRE_DATE", operationtype.eclick, "", "XPATH");
		//	driver.findElement(By.xpath("(.//*[@ng-change='onListEditComboChange(modelId)'])[5]")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("(.//*[@ng-value='c.EmployeeStatusID'])[2]")).click();
		UtilityMethods.ExplicitWait_Operation("TXT_NATIONAL_REF", operationtype.esendkeys, National_Ref, "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_TITLE", operationtype.esendkeys, Title, "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_PREFIX", operationtype.esendkeys, Prfix, "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_SUFFIX", operationtype.esendkeys, Suffix, "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_RECORD_PER_GRID", operationtype.eclear, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_RECORD_PER_GRID", operationtype.esendkeys,RecordPerPage, "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_ADDRESS1", operationtype.esendkeys, Address1, "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_ADDRESS2", operationtype.esendkeys, Address2, "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_CITY", operationtype.esendkeys, City, "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_STATE", operationtype.esendkeys, State, "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_POSTAL_CODE", operationtype.esendkeys, P_Code, "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_COUNTRY", operationtype.esendkeys, Country, "XPATH");
		UtilityMethods.ExplicitWait_Operation("ADD_PHNO_ROW", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_NUMBER", operationtype.esendkeys, Number, "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_NUM_TYPE", operationtype.esendkeys, Num_Type, "XPATH");
		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("BTN_PH_DONE", operationtype.eclick, "", "XPATH");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement el  =  driver.switchTo().activeElement();
		new Actions(driver).moveToElement(el).perform();
		driver.findElement(By.xpath("/html/body")).sendKeys(Notes);
		driver.switchTo().defaultContent(); 
		System.out.println("EMPLOYEE PERSONAL INFORMATION ADDED");		
	}

	@DataProvider(name="Testdata")
	public Object[][] getTestData()
	{
		return UtilityMethods.getTestDataFromXLS(Test_Data, "Employee_Data");
	}

}
