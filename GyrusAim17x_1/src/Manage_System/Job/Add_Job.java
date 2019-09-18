package Manage_System.Job;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Manage_System.Assign_Operation;
import Manage_System.BaseInitManageSystem;
import Utility.UtilityMethods;
import Utility.UtilityMethods.operationtype;

public class Add_Job extends BaseInitManageSystem{

	@BeforeTest
	public void CheckTestCaseExecution() {

		if(!UtilityMethods.checkExecutionModeTestCase(Test_Cases, this.getClass().getSimpleName(), "Manage_System"))
		{
			throw new SkipException("Execution mode of testcase set No");
		}
	}

	@Test
	public void Adding_Job() throws InterruptedException 
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//*[@ng-click='openView(enuMenu.Job_Add)']")).click();
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("TXT_JOb_NAME", operationtype.esendkeys, "Automation Job", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_JOb_CODE", operationtype.esendkeys, "Auto Job 1", "XPATH");
		UtilityMethods.ExplicitWait_Operation("CAL_ARC_JOB", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("MONTH_DATE_DEACTIVATE_CAL", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SEL_DEACTIVATE_MONTH", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SEL_DEACTIVATE_DATE", operationtype.eclick, "", "XPATH");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement el = driver.switchTo().activeElement();
		new Actions(driver).moveToElement(el).perform();
		driver.findElement(By.xpath("/html/body")).sendKeys("Test Job adding form Description");
		driver.switchTo().defaultContent(); 
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		WebElement el1 = driver.switchTo().activeElement();
		new Actions(driver).moveToElement(el1).perform();
		driver.findElement(By.xpath("/html/body")).sendKeys("Test Job adding form Notes");
		driver.switchTo().defaultContent(); 
		UtilityMethods.ExplicitWait_Operation("BTN_SAVENEXT_JOB", operationtype.eclick, "", "XPATH");
		Thread.sleep(5000);
		Assign_Operation.Assignment();
		UtilityMethods.ExplicitWait_Operation("BTN_SAVE_JOB", operationtype.eclick, "", "XPATH");
		System.out.println("JOB ADDED");
	}

	@Test(priority=1)
	public void Edit_Job() throws InterruptedException
	{
		Thread.sleep(5000);
		Job_Search();
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("CH_JOB", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("LINK_BTN_EDIT_ORG", operationtype.eclick, "", "XPATH");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(.//*[@id='btnEditJob'])[1]")).click();
		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("TXT_JOb_NAME", operationtype.eclear, " ", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_JOb_NAME", operationtype.esendkeys, "Automation Job Tester", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_JOb_CODE", operationtype.eclear, " ", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_JOb_CODE", operationtype.esendkeys, "Automation Job Code1", "XPATH");
		UtilityMethods.ExplicitWait_Operation("CAL_ARC_JOB", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("MONTH_DATE_DEACTIVATE_CAL", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SEL_DEACTIVATE_MONTH", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SEL_DEACTIVATE_DATE", operationtype.eclick, "", "XPATH");
		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("BTN_SAVENEXT_JOB", operationtype.eclick, "", "XPATH");
		Thread.sleep(5000);
		Assign_Operation.Edit_Assignment();
		UtilityMethods.ExplicitWait_Operation("BTN_SAVE_JOB", operationtype.eclick, "", "XPATH");
		System.out.println("EDIT JOB DONE SUCCUSSFULLY");

	}

	@Test(priority=2)
	public void Delete_Job() throws InterruptedException
	{
		Thread.sleep(5000);
		Job_Search();
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("CH_JOB", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_DELETE_ORG", operationtype.eclick, "", "XPATH");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(.//*[@aria-label='confirmation-delete']//*[@type='button'])[2]")).click();
		System.out.println("DELETE JOB DONE SUCCUSSFULLY");
	}

	public void Job_Search() throws InterruptedException
	{
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("TXT_SEARCH_EMPLOYEE", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_SEARCH_EMPLOYEE", operationtype.esendkeys, "Automation Job", "XPATH");
	}
}
