package Manage_System.Organization;

import org.testng.annotations.Test;

import Manage_System.Assign_Operation;
import Manage_System.BaseInitManageSystem;
import Utility.UtilityMethods;
import Utility.UtilityMethods.operationtype;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	public void Add_ORG() throws InterruptedException 
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//*[@ng-click='openView(enuMenu.Organization_Add)']")).click();
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("TXT_ORG_NAME", operationtype.esendkeys, "Automation Organization", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_ORG_CODE", operationtype.esendkeys, "Automation Organization 1", "XPATH");
		UtilityMethods.ExplicitWait_Operation("CAL_ARC_JOB", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("MONTH_DATE_DEACTIVATE_CAL", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SEL_DEACTIVATE_MONTH", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SEL_DEACTIVATE_DATE", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_ADD1_ORG", operationtype.esendkeys, "804", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_ADD2_ORG", operationtype.esendkeys, "SNS Platina", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_CITY_ORG", operationtype.esendkeys, "Surat", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_STATE_ORG", operationtype.esendkeys, "Gujarat", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_POSTAL_CODE_ORG", operationtype.esendkeys, "395007", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_COUNTRY_ORG", operationtype.esendkeys, "India", "XPATH");
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
		UtilityMethods.ExplicitWait_Operation("BTN_SAVENEXT_ORG", operationtype.eclick, "", "XPATH");
		Thread.sleep(5000);
		Assign_Operation.Assignment();
		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("BTN_SAVEEXIT_ORG", operationtype.eclick, "", "XPATH");
		System.out.println("ADD ORGANIZATION DONE");

	}

	@Test(priority=1)
	public void Edit_ORG() throws InterruptedException
	{
		Thread.sleep(7000);
		Organization_Search();
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("CH_ORG", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("LINK_BTN_EDIT_ORG", operationtype.eclick, "", "XPATH");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(.//*[@title='EditOrganization'])[1]")).click();
		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("TXT_ORG_NAME", operationtype.eclear, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_ORG_NAME", operationtype.esendkeys, "Automation Organization 123", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_ORG_CODE", operationtype.eclear, " ", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_ORG_CODE", operationtype.esendkeys, "Automation Organization 2", "XPATH");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='btnSaveWizard']//span[1]")).click();
		Thread.sleep(3000);
		Assign_Operation.Edit_Assignment();
		UtilityMethods.ExplicitWait_Operation("BTN_SAVEEXIT_ORG", operationtype.eclick, "", "XPATH");
		System.out.println("EDIT ORGANIZATION DONE");
	}

	@Test(priority=2)
	public void Delete_Organization() throws InterruptedException
	{
		Thread.sleep(7000);
		Organization_Search();
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("CH_ORG", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_DELETE_ORG", operationtype.eclick, "", "XPATH");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(.//*[@aria-label='confirmation-delete']//*[@type='button'])[2]")).click();
		System.out.println("DELETE ORGANIZATION DONE SUCCUSSFULLY");
		Thread.sleep(3000);
		driver.get("https://vipul.gyrusaim.net/dashboard");	
	}

	public void Organization_Search() throws InterruptedException
	{
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("TXT_SEARCH_EMPLOYEE", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_SEARCH_EMPLOYEE", operationtype.esendkeys, "Automation Organization", "XPATH");
	}
}
