package Training_Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Parent.BaseInit;
import Utility.UtilityMethods;
import Utility.UtilityMethods.operationtype;

public class Training_Objective extends BaseInit{

	@Test
	public static void Training_OBJ() throws InterruptedException 
	{

		

		
		//--------------------ASSESSMENT------------------------//
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		UtilityMethods.ExplicitWait_Operation("DD_TR_CR", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SEL_TR_CR_VALUE", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_MIN_SCORE", operationtype.esendkeys, "5", "XPATH");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='divELearningApp']/div[2]/md-content/ui-view/div/div[2]/div/div[1]/div/div/div[2]/div/button[2]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(.//*[@name='AssessmentModel_AssessmentTypeID'])[1]")).click();

		//UtilityMethods.ExplicitWait_Operation("BTN_ADD_ASSESSMENT", operationtype.eclick, "", "XPATH");
		//UtilityMethods.ExplicitWait_Operation("DD_ASSESSMENT_TYPE", operationtype.eclick, "", "XPATH");
		//	UtilityMethods.ExplicitWait_Operation("SEL_ASSESSMENT_TYPE_DD", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_SEARCH", operationtype.esendkeys, "ISTQB Question", "XPATH");
		UtilityMethods.ExplicitWait_Operation("SEL_CH_QUESTION", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_SHOW_SELECTED", operationtype.eclick, "", "XPATH");

		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='grdAssessmentQuestionCategory']/tbody/tr/td[1]/div/div[1]/button")).click();
		UtilityMethods.ExplicitWait_Operation("BTN_EDIT_ASSESSMENT", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("TXT_NUM_QUE_ASSESSMENT", operationtype.esendkeys, "2", "CSS");
		UtilityMethods.ExplicitWait_Operation("EDT_QUE_AS_BTN_SAVE", operationtype.eclick, "", "CSS");


		Thread.sleep(7000);
		WebElement Element1 = driver.findElement(By.cssSelector("#numAssessmentModelCountdownTime"));
		js.executeScript("arguments[0].scrollIntoView();", Element1);

		UtilityMethods.ExplicitWait_Operation("TXT_CO_DW_TIME", operationtype.esendkeys, "100", "CSS");
		UtilityMethods.ExplicitWait_Operation("CH_ALLOW_PAR_SAVE", operationtype.eclick, "", "XPATH");

		//----------------Editor Summary-----------
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement el  =  driver.switchTo().activeElement();
		new Actions(driver).moveToElement(el).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body")).sendKeys("Check");
		driver.switchTo().defaultContent(); 

		//----------------Editor Instructions-----------
		Thread.sleep(5000);
		driver.switchTo().frame(1);
		WebElement ell  =  driver.switchTo().activeElement();
		new Actions(driver).moveToElement(ell).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body")).sendKeys("Check");
		driver.switchTo().defaultContent(); 

		Thread.sleep(7000);
		WebElement Element2 = driver.findElement(By.xpath(".//*[@id='btnSaveObjective']"));
		js.executeScript("arguments[0].scrollIntoView();", Element2); 

		UtilityMethods.ExplicitWait_Operation("BTN_SAVE_ASSESSMENT", operationtype.eclick, "", "CSS");
		System.out.println("ASSESSMENT ADDED SUCCUSSFULLY"); 

		
		//---------------------------EVALUTION-----------------------//
        Thread.sleep(7000);
		UtilityMethods.ExplicitWait_Operation("BTN_SHOW_EVALUTION", operationtype.eclick, "", "XPATH");
		UtilityMethods.ExplicitWait_Operation("BTN_ADD_EVALUTION", operationtype.eclick, "", "XPATH");
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//md-input-container//input[@ng-model='searchFilterText']")).sendKeys("Feedback Student");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(".//md-input-container//input[@ng-model='searchFilterText']")));
		actions.sendKeys("Feedback Student");
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("SEL_CH_EVALUTION", operationtype.eclick, "", "XPATH");	
		Thread.sleep(5000);
		UtilityMethods.ExplicitWait_Operation("BTN_SAVE_EVALUTION", operationtype.eclick, "", "XPATH");
		
		Thread.sleep(7000);
		WebElement Element3 = driver.findElement(By.xpath(".//*[@id='btnPreSaveEvaluation']"));
		js.executeScript("arguments[0].scrollIntoView();", Element3); 
		UtilityMethods.ExplicitWait_Operation("BTN_MAIN_SAVE_EVALUTION", operationtype.eclick, "", "XPATH");
		System.out.println("EVALUTION SAVE SUCCUSSFULLY");
		Thread.sleep(7000);
		UtilityMethods.ExplicitWait_Operation("BTN_SAVE_OBJECTIVE", operationtype.eclick, "", "CSS");


	}
}
