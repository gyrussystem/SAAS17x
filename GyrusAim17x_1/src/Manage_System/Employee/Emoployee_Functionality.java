package Manage_System.Employee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Manage_System.Assign_Operation;
import Manage_System.BaseInitManageSystem;
import Utility.UtilityMethods;
import Utility.UtilityMethods.operationtype;

public class Emoployee_Functionality extends BaseInitManageSystem{

	@BeforeTest
	public void CheckTestCaseExecution() 
	{

		if(!UtilityMethods.checkExecutionModeTestCase(Test_Cases, this.getClass().getSimpleName(), "Manage_System"))
		{
			throw new SkipException("Execution mode of testcase set No");
		}
	}

	@Test(dataProvider="Testdata1", priority=1)
	public void View_Add_Employee(String Emp_Number, String FirstName, String MiddleName, String LastName, String Email, String WindowName, String National_Ref, String Title, String Prfix, String Suffix, String RecordPerPage, String Address1, String Address2, String City, String State, String P_Code, String Country, String Number, String Num_Type, CharSequence Notes ) throws InterruptedException 
	{
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("BTN_ACTION", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_VIEW_EMPLOYEE", operationtype.eclick, "", "XPATH");
		System.out.println("==>ADD EMPLOYEE FUNCTIONALITY FROM GRID START..... ");
		Thread.sleep(7000);
		UtilityMethods.ExplicitWait_Operation("BTN_VIEW_ADD_EMPLOYEE", operationtype.eclick, "", "XPATH");
		Add_Employee.Employee_Personal_Info(Emp_Number, FirstName, MiddleName, LastName, Email, WindowName, National_Ref, Title, Prfix, Suffix, RecordPerPage, Address1, Address2, City, State, P_Code, Country, Number, Num_Type, Notes);
		UtilityMethods.ExplicitWait_Operation("BTN_READY_FININSH", operationtype.eclick, "", "XPATH");
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("BTN_SAVE_EXIT", operationtype.eclick, "", "XPATH");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@ng-click='dialog.abort()']")).click();
		System.out.println("==>ADD EMPLOYEE FUNCTIONALITY FROM GRID COMPLETED..... ");
	}

	@Test(priority=2)
	public void Edit_Employee() throws InterruptedException
	{
		System.out.println("==>EDIT EMPLOYEE FUNCTIONALITY START..... ");
		Thread.sleep(5000);
		Employee_Selection();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@class='innerbtns']//preceding-sibling::div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@title='Edit']")).click();
		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("TXT_EMP_NAME", operationtype.eclear," " , "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_EMP_NAME", operationtype.esendkeys,"Auto Test 15" , "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_NEXT_EMPLOYEE", operationtype.eclick, "", "XPATH");
		Assign_Operation.Employee_Deselect_Assignment();
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("BTN_SAVE_EXIT", operationtype.eclick, "", "XPATH");
		System.out.println("==>EDIT EMPLOYEE FUNCTIONALITY COMPLETED..... ");
	}

	@Test(priority=3)
	public void Deactivate_Employee() throws InterruptedException
	{
		System.out.println("==>DE-ACTIVATE EMPLOYEE FUNCTIONALITY START..... ");
		Thread.sleep(7000);
		Employee_Selection();
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("CH_EMPLOYEE_DEL", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_DEACTIVATE_EMPLOYEE", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_OP_DEACTIVATE_EMP_CALENDER", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("MONTH_DATE_DEACTIVATE_CAL", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SEL_DEACTIVATE_MONTH", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SEL_DEACTIVATE_DATE", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_SAVE_DEACTIVATE", operationtype.eclick, "", "XPATH");
		try
		{
			Thread.sleep(3000);
			WebElement ele = driver.findElement(By.xpath(".//*[@id='divEmployeeApp']/md-toast/div/span"));

			if(ele.isDisplayed())
			{
				System.out.println(ele.getText());
				System.out.println("==>DE-ACTIVATE EMPLOYEE FUNCTIONALITY COMPLETED..... ");
			}
		}
		catch(Exception e) 
		{
			System.out.println("==>DE-ACTIVATE EMPLOYEE FUNCTIONALITY COMPLETED..... ");
		}

	}
	@Test(priority =4)
	public void Delete_Employee() throws InterruptedException
	{
		System.out.println("==>DELETE EMPLOYEE FUNCTIONALITY START..... ");
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("TXT_SEARCH_EMPLOYEE", operationtype.eclear, "", "XPATH");
		Employee_Selection();
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("CH_EMPLOYEE_DEL", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_DELETE_EMPLOYEE", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_DEL_COFIRMATION_YES", operationtype.eclick, "", "XPATH");

		try 
		{
			Thread.sleep(3000);
			WebElement ele1 = driver.findElement(By.xpath(".//*[@id='divEmployeeApp']/md-toast/div/span"));

			if(ele1.isDisplayed())
			{	
				System.out.println(ele1.getText());
				System.out.println("==>DELETE EMPLOYEE FUNCTIONALITY COMPLETED..... ");
			}
		}
		catch(Exception e) 
		{
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[@title='Ok']")).click();
			System.out.println("==>DELETE EMPLOYEE FUNCTIONALITY COMPLETED..... ");
		}
		UtilityMethods.ExplicitWait_Operation("TXT_SEARCH_EMPLOYEE", operationtype.eclear, "", "XPATH");
	}

	@Test(priority=5)
	public void Action_Employee_Functioanlity() throws InterruptedException 
	{

		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("BTN_ACTION_EMP_HOVER", operationtype.eclick,"", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_ACTION_IDP", operationtype.eclick,"", "XPATH");
		Thread.sleep(5000);
		String ele = driver.findElement(By.xpath(".//*[@id='divEmployeeApp']/div[2]/md-content/ui-view/div/md-toolbar/div/span/a[3]/strong")).getText();

		if(ele.endsWith("IDP"))
		{
			System.out.println("IDP From loaded from Employee List");
			Thread.sleep(5000);
			UtilityMethods.ExplicitWait_Operation("LINK_EMPLOYEE_LIST", operationtype.eclick,"", "XPATH");
		}
		else {

			System.out.println("IDP From not loaded from Employee List");
		}

		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("BTN_ACTION_EMP_HOVER", operationtype.eclick,"", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_ACTION_TT", operationtype.eclick, "", "XPATH");

		String ele1 = driver.findElement(By.xpath(".//*[@id='divEmployeeApp']/div[2]/md-content/ui-view/div/md-toolbar/div/span/a[3]/strong")).getText();
		if(ele1.endsWith("Training Transcript"))
		{
			System.out.println("Training Transcript From loaded from Employee List");
			Thread.sleep(7000);
			UtilityMethods.ExplicitWait_Operation("LINK_EMPLOYEE_LIST", operationtype.eclick,"", "XPATH");
		}
		else {
			System.out.println("Training Transcript From not loaded from Employee List");
		}

		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("BTN_ACTION_EMP_HOVER", operationtype.eclick,"", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_ACTION_GAP_ANA", operationtype.eclick, "", "XPATH");

		String ele2 = driver.findElement(By.xpath(".//*[@id='divEmployeeApp']/div[2]/md-content/ui-view/div/md-toolbar/div/span/a[3]/strong")).getText();
		if(ele2.endsWith("Gap Analysis"))
		{
			System.out.println("Gap Analysis From loaded from Employee List");
			Thread.sleep(10000);
			driver.findElement(By.xpath(".//*[@id='divEmployeeApp']//a[2]")).click();
		}
		else {
			System.out.println("Gap Analysis From not loaded from Employee List");
		}

		Thread.sleep(5000);
		Employee_Selection();
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("BTN_ACTION_EMP_HOVER", operationtype.eclick,"", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_ACTION_DELETE", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_DEL_COFIRMATION_YES", operationtype.eclick, "", "XPATH");

		try {
			Thread.sleep(3000);
			WebElement eleE = driver.findElement(By.xpath(".//*[@id='divEmployeeApp']/md-toast/div/span"));
			if(eleE.isDisplayed())
			{
				System.out.println(eleE.getText());
			}
		}
		catch(Exception e) 
		{
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[@title='Ok']")).click();
			System.out.println("Employee is not deleted");
		}
		Thread.sleep(3000);
		driver.get("https://vipul.gyrusaim.net/dashboard");	
	}

	public void Employee_Selection() throws InterruptedException
	{
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("TXT_SEARCH_EMPLOYEE", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_SEARCH_EMPLOYEE", operationtype.esendkeys, "Auto Test", "XPATH");
	}

	@DataProvider(name="Testdata1")
	public Object[][] getTestData1()
	{
		return UtilityMethods.getTestDataFromXLS(Test_Data, "View_ADD_EMP");
	} 
}
