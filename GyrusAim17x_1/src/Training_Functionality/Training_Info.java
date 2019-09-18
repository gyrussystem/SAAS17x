package Training_Functionality;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Parent.BaseInit;
import Utility.UtilityMethods;
import Utility.UtilityMethods.operationtype;

public class Training_Info extends BaseInit{

	
	@Test
	public static void Training_Details(String T_name, String T_Code, String TGRP_SER, String URL, String T_Hour, String T_SER_VENDOR, String T_COM_HR, String goal, String summary, String note) throws InterruptedException, IOException, AWTException 
	{

		UtilityMethods.ExplicitWait_Operation("TXT_NAME", operationtype.esendkeys, T_name, "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_CODE", operationtype.esendkeys, T_Code, "XPATH");
		UtilityMethods.ExplicitWait_Operation("DD_TRAINING_GROUP", operationtype.eclick, " ", "XPATH");
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("TXT_SEARCH_TR_GRP", operationtype.esendkeys, TGRP_SER, "XPATH");
		UtilityMethods.ExplicitWait_Operation("SEL_DD_VALUE_TR", operationtype.eclick, " ", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_URL", operationtype.esendkeys, URL, "XPATH");

		
		Thread.sleep(3000);
		String element1 = driver.findElement(By.xpath(".//*[@id='contentgyrus']/md-content/div[2]/md-toolbar/div/span/a[3]")).getText();
         System.out.println(element1);
		
		if(element1.equalsIgnoreCase("e-Learning"))
		{
		driver.findElement(By.xpath("(.//*[@ng-class='strBrowseButtonCls'])[1]")).click();
		//	UtilityMethods.ExplicitWait_Operation("BTN_FILE_UPLOAD", operationtype.eclick, "", "XPATH");
		Thread.sleep(3000);
		//	Runtime.getRuntime().exec("C:\\Users\\VCP\\Desktop\\AutoIT\\HC.exe");

		Robot robot = new Robot();
		StringSelection attachment_path = new StringSelection("C:\\Users\\VCP\\Desktop\\SCORM Files\\3dbook.zip");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(attachment_path, null);

		robot.setAutoDelay(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);  
		}
		
		else if(element1.equalsIgnoreCase("Document"))
		{
			driver.findElement(By.xpath(".//label[@aria-label='Add']")).click();
			//	UtilityMethods.ExplicitWait_Operation("BTN_FILE_UPLOAD", operationtype.eclick, "", "XPATH");
			Thread.sleep(3000);
			//	Runtime.getRuntime().exec("C:\\Users\\VCP\\Desktop\\AutoIT\\HC.exe");

			Robot robot = new Robot();
			StringSelection attachment_path = new StringSelection("C:\\Users\\VCP\\Desktop\\SCORM Files\\GyrusTraining.docx");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(attachment_path, null);

			robot.setAutoDelay(5000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.setAutoDelay(5000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER); 
		}
		else {
			System.out.println("This is not a e-Learning form");
		}

		Thread.sleep(7000);
		UtilityMethods.ExplicitWait_Operation("TXT_TRAINING_HR", operationtype.esendkeys, T_Hour, "XPATH");
		UtilityMethods.ExplicitWait_Operation("CH_REQ_APPROVE", operationtype.eclick, "", "XPATH");

		Thread.sleep(5000);
		driver.findElement(By.xpath("(.//*[@ng-click='ctrl.openCalendarPane($event)'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(.//tr[@aria-label='Week undefined'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@aria-label='April 2020']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@aria-label='Sunday April 5 2020']")).click();

		WebElement Element = driver.findElement(By.xpath(".//*[@ng-model='learningObjectModel.LearningObjectData.RequiresApproval']/div[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);

		UtilityMethods.ExplicitWait_Operation("BTN_SHOW_MORE", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("DD_VENDOR", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_SEARCH_VENDOR", operationtype.esendkeys, T_SER_VENDOR, "XPATH");
		UtilityMethods.ExplicitWait_Operation("SEL_DD_VALUE_VENDOR", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_COMPLETION_HR", operationtype.esendkeys, T_COM_HR, "XPATH"); 

		//	----------------Editor Goal-----------
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement el  =  driver.switchTo().activeElement();
		new Actions(driver).moveToElement(el).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body")).sendKeys(goal);
		driver.switchTo().defaultContent(); 

		//----------------Editor Summary-----------
		Thread.sleep(5000);
		driver.switchTo().frame(1);
		WebElement ell  =  driver.switchTo().activeElement();
		new Actions(driver).moveToElement(ell).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body")).sendKeys(summary);
		driver.switchTo().defaultContent(); 

		//----------------Editor Notes-----------
		Thread.sleep(5000);
		driver.switchTo().frame(2);
		WebElement elll  =  driver.switchTo().activeElement();
		new Actions(driver).moveToElement(elll).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body")).sendKeys(note);
		driver.switchTo().defaultContent(); 


		System.out.println("Training Information Added Succussfully");

		//------------------------Virtual_Resources-----------------------------

		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("VIRTUAL_RES_ARROW_BTN", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_ADD_VR", operationtype.eclick, "", "XPATH");
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("TXT_SEARCH_VR", operationtype.esendkeys, "Basic External Link Training", "XPATH");
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("SEL_CH", operationtype.eclick, "", "XPATH");
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("BTN_SEL_VR", operationtype.eclick, "", "XPATH");
		System.out.println("Virtual Resource Added Succussfully");

		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("SEL_CH", operationtype.eclick, "", "XPATH");
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("BTN_DEL_VR", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("VIRTUAL_RES_ARROW_BTN", operationtype.eclick, "", "XPATH");
		System.out.println("Virtual Resource Deleted Succussfully");

		//	------------------------Pre-Requisite-Training-----------------------------
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("PRE_REQ_ARROW_BTN", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_ADD_PRE_REQ", operationtype.eclick, "", "XPATH");
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("TXT_SEARCH_VR", operationtype.esendkeys, "Basic Document Training", "XPATH");
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("SEL_CH", operationtype.eclick, "", "XPATH");
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("BTN_SEL_PRE_REQ", operationtype.eclick, "", "XPATH");
		System.out.println("Pre Request Training Added Succussfully");

		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("SEL_CH", operationtype.eclick, "", "XPATH");
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("BTN_DEL_PRE", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("PRE_REQ_ARROW_BTN", operationtype.eclick, "", "XPATH"); 
		System.out.println("Pre Request Training Deleted Succussfully"); 

//---------Email-Notification-----------------
		
		UtilityMethods.ExplicitWait_Operation("ADD_EMAIL", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("DD_COMPITION", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SEL_COMPITION", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("DD_ENROLL_CANCEL", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SEL_ENROL_CAN", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("DD_REMINDER", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SEl_REMINDER", operationtype.eclick, "", "XPATH");
		System.out.println("Email Notification Setting Done Succussfully"); 
		
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("BTN_SAVE_NEXT", operationtype.eclick, "", "XPATH");
		System.out.println("Move To Training Objective Page"); 


	}
	
	
}
