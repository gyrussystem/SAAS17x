package Manage_System;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utility.UtilityMethods;
import Utility.UtilityMethods.operationtype;

public class Assign_Operation extends BaseInitManageSystem{

	@Test
	public static void Employee_Assignment() throws InterruptedException 
	{
		try 
		{
			Thread.sleep(5000);
			UtilityMethods.ExplicitWait_Operation("LINK_ORG", operationtype.eclick, "", "XPATH");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(.//*[@id='selectTree_EmpOrgTreeGrid']//*[@class='md-container md-ink-ripple'])[1]")).click();
			UtilityMethods.ExplicitWait_Operation("SHOW_SEL_ORG", operationtype.eclick, "", "XPATH");
			System.out.println("ORGANIZATION SELECTED SUCCUSSFULLY");
		}
		catch(Exception e) 
		{
			System.out.println("ORGANIZATION IS NOT SELECTED");		
		}

		try 
		{
			Thread.sleep(3000);
			UtilityMethods.ExplicitWait_Operation("LINK_JOB", operationtype.eclick, "", "XPATH");
			Thread.sleep(3000);
			driver.findElement(By.xpath(" (.//*[@id='selectTree_EmpJobTreeGrid']//*[@class='md-container md-ink-ripple'])[1]")).click();
			UtilityMethods.ExplicitWait_Operation("SHOW_SEL_JOB", operationtype.eclick, "", "XPATH");
			System.out.println("JOB SELECTED SUCCUSSFULLY");
		}
		catch(Exception e) 
		{
			System.out.println("JOB IS NOT SELECTED");		
		}

		try 
		{
			Thread.sleep(3000);
			UtilityMethods.ExplicitWait_Operation("LINK_SUPERVISOR", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("CH_SUPERVISOR", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("SHOW_SEL_SUPERVISOR", operationtype.eclick, "", "XPATH");
			System.out.println("SUPERVISOR SELECTED SUCCUSSFULLY");		
		}
		catch(Exception e) 
		{
			System.out.println("SUPERVISOR IS NOT SELECTED");		
		}

		try 
		{
			Thread.sleep(3000);
			UtilityMethods.ExplicitWait_Operation("LINK_STAFF", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("CH_STAFF", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("SHOW_SEL_STAFF", operationtype.eclick, "", "XPATH");
			System.out.println("STAFF SELECTED SUCCUSSFULLY");		
		}
		catch(Exception e) 
		{
			System.out.println("STAFF IS NOT SELECTED");		
		}
		System.out.println("ASSIGNMENT OPERATION DONE SUCCUSSFULLY");
	}

	public static void Employee_Advance_Assignment() throws InterruptedException 
	{
		UtilityMethods.ExplicitWait_Operation("BTN_NEXT_EMPLOYEE", operationtype.eclick, "", "XPATH");
		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("LINK_CERTIFICATE", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("CH_CERTIFICATE", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SHOW_SEL_CERTIFICATE", operationtype.eclick, "", "XPATH");
		System.out.println("CERTIFICATE SELECTED SUCCUSSFULLY");		

		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("LINK_TRAINING_REQ", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("CH_TRAINING_REQ", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SHOW_SEL_TRAINING_REQ", operationtype.eclick, "", "XPATH");
		System.out.println("TRAINING REQUIRMENT SELECTED SUCCUSSFULLY");		

		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("LINK_TRAINING_OBTAIN", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("CH_TRAINING_OBTAIN", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SHOW_SEL_TRAINING_OBTAIN", operationtype.eclick, "", "XPATH");
		System.out.println("TRAINING OBTAIN SELECTED SUCCUSSFULLY");			
		System.out.println("ADVANCE ASSIGNMENT OPERATION DONE SUCCUSSFULLY");
	}

	public static void Employee_Deselect_Assignment() throws InterruptedException 
	{
		Thread.sleep(7000);
		UtilityMethods.ExplicitWait_Operation("LINK_ORG", operationtype.eclick, "", "XPATH");
		driver.findElement(By.xpath(".//*[@id='grdEmployeeOrganizationAssociationSelected']//*[@name='chk']")).click();
		System.out.println("ORGANIZATION DE-SELECTED SUCCUSSFULLY");		

		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("LINK_JOB", operationtype.eclick, "", "XPATH");
		driver.findElement(By.xpath(".//*[@id='grdEmployeeJobAssociationSelected']//*[@name='chk']")).click();
		System.out.println("JOB DE-SELECTED SUCCUSSFULLY");

		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("LINK_SUPERVISOR", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("CH_SUPERVISOR", operationtype.eclick, "", "XPATH");
		System.out.println("SUPERVISOR DE-SELECTED SUCCUSSFULLY");

		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("LINK_STAFF", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("CH_STAFF", operationtype.eclick, "", "XPATH");
		System.out.println("STAFF DE-SELECTED SUCCUSSFULLY");

		UtilityMethods.ExplicitWait_Operation("BTN_NEXT_EMPLOYEE", operationtype.eclick, "", "XPATH");
		System.out.println("ASSIGNMENT OPERATION DE-SELECTED SUCCUSSFULLY");

		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("LINK_CERTIFICATE", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("CH_CERTIFICATE", operationtype.eclick, "", "XPATH");
		System.out.println("CERTIFICATE DE-SELECTED SUCCUSSFULLY");

		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("LINK_TRAINING_REQ", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("CH_TRAINING_REQ", operationtype.eclick, "", "XPATH");
		System.out.println("TRAINING REQUIRED DE-SELECTED SUCCUSSFULLY");

		Thread.sleep(3000);
		UtilityMethods.ExplicitWait_Operation("LINK_TRAINING_OBTAIN", operationtype.eclick, "", "XPATH");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='grdPersonSkillObtainedAssociation']//*[@name='chk']")).click();
		System.out.println("TRAINING OBTAIN DE-SELECTED SUCCUSSFULLY");

		UtilityMethods.ExplicitWait_Operation("BTN_NEXT_EMPLOYEE", operationtype.eclick, "", "XPATH");
		System.out.println("ADVANCE ASSIGNMENT OPERATION DE-SELECTED SUCCUSSFULLY");
	}

	public static void Assignment() throws InterruptedException 
	{
		Thread.sleep(7000);
		try 
		{
			UtilityMethods.ExplicitWait_Operation("LINK_EMP_OJ", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("CH_EMP_OJ", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("SHOW_SEL_EMP_OJ", operationtype.eclick, "", "XPATH");
			System.out.println("EMPLOYEE SELECTED SUCCUSSFULLY");
		}
		catch(Exception e) 
		{
			System.out.println("EMPLOYEE IS NOT SELECTED");	
		}

		try 
		{
			Thread.sleep(3000);
			UtilityMethods.ExplicitWait_Operation("LINK_TRN_OJ", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("CH_TRN_OJ", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("SHOW_SEL_TRN_OJ", operationtype.eclick, "", "XPATH");
			System.out.println("TRAINING SELECTED SUCCUSSFULLY");
		}
		catch(Exception e) 
		{
			System.out.println("TRAINING IS NOT SELECTED");		
		}

		try 
		{
			Thread.sleep(3000);
			UtilityMethods.ExplicitWait_Operation("LINK_CER_OJ", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("CH_CER_OJ", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("SHOW_SEL_CER_OJ", operationtype.eclick, "", "XPATH");
			System.out.println("CERTIFICATE SELECTED SUCCUSSFULLY");	
		}
		catch(Exception e) 
		{
			System.out.println("CERTIFICATE IS NOT SELECTED");				
		}

		try 
		{
			Thread.sleep(3000);
			UtilityMethods.ExplicitWait_Operation("LINK_JOB_OJ", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("CH_JOB_OJ", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("SHOW_SEL_JOB_OJ", operationtype.eclick, "", "XPATH");
			System.out.println("JOB SELECTED SUCCUSSFULLY");	
		}
		catch(Exception e) 
		{
			System.out.println("JOB IS NOT SELECTED");		
		}

		try 
		{
			Thread.sleep(3000);
			UtilityMethods.ExplicitWait_Operation("LINK_ORJ_OJ", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("CH_ORJ_OJ", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("SHOW_SEL_ORJ_OJ", operationtype.eclick, "", "XPATH");
			System.out.println("ORGANIZATION SELECTED SUCCUSSFULLY");
		}
		catch(Exception e) 
		{
			System.out.println("ORGANIZATION IS NOT SELECTED");		
		}

		System.out.println("ASSIGNMENT OPERATION DONE SUCCUSSFULLY");
	}

	public static void Edit_Assignment() throws InterruptedException 
	{
		try 
		{
			Thread.sleep(7000);
			UtilityMethods.ExplicitWait_Operation("LINK_EMP_OJ", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("CH_EMP_OJ", operationtype.eclick, "", "XPATH");
			System.out.println("EMPLOYEE DE-SELECTED SUCCUSSFULLY");	
		}
		catch(Exception e) 
		{
			System.out.println("EMPLOYEE IS NOT SELECTED");			
		}

		try 
		{
			Thread.sleep(3000);
			UtilityMethods.ExplicitWait_Operation("LINK_TRN_OJ", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("CH_TRN_OJ", operationtype.eclick, "", "XPATH");
			System.out.println("TRAINING DE-SELECTED SUCCUSSFULLY");
		}
		catch(Exception e) 
		{
			System.out.println("TRAINING IS NOT SELECTED");			
		}

		try 
		{
			Thread.sleep(3000);
			UtilityMethods.ExplicitWait_Operation("LINK_CER_OJ", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("CH_CER_OJ", operationtype.eclick, "", "XPATH");
			System.out.println("CERTIFICATE DE-SELECTED SUCCUSSFULLY");		
		}
		catch(Exception e) 
		{
			System.out.println("CERTIFICATION IS NOT SELECTED");			
		}

		try 
		{
			Thread.sleep(3000);
			UtilityMethods.ExplicitWait_Operation("LINK_JOB_OJ", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("DE_SEL_CH_JOB", operationtype.eclick, "", "XPATH");
			Thread.sleep(3000);
			System.out.println("JOB DE-SELECTED SUCCUSSFULLY");		
		}
		catch(Exception e) 
		{
			System.out.println("JOB IS NOT SELECTED");			
		}

		try 
		{
			Thread.sleep(3000);
			UtilityMethods.ExplicitWait_Operation("LINK_ORJ_OJ", operationtype.eclick, "", "XPATH");
			UtilityMethods.ExplicitWait_Operation("DE_SEL_CH_ORG", operationtype.eclick, "", "XPATH");
			System.out.println("ORGNIZATION DE-SELECTED SUCCUSSFULLY");	
		}
		catch(Exception e) 
		{
			System.out.println("ORGANIZATION IS NOT SELECTED");		
		}

		System.out.println("EDIT ASSIGNMENT OPERATION DONE SUCCUSSFULLY");
	}
}
