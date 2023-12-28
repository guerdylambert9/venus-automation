package testcase;
//C:\eclipse-java-workspace\VenusAutomation\src\test\java\testcase\LoginTest.java
import testcase.LoginTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class VenusUnlocked extends BaseTest {

	@Test(priority = 2)
	public static void EbboEnrollementWithVisaFreeShipping() {
		// log user in
//		LoginTest lt = new LoginTest();
//		lt.UserLogin();
		//LoginTest.UserLogin();
		System.out.println("INSIDE OF VENUSUNLOCKED CLASS");
		
		// click on DRESSES
		driver.findElement(By.xpath("//ul[@class='btn-group']/li[2]")).click();
		
		// click on Little Black Dresses
		driver.findElement(By.xpath("//a[@id='desktopnav-9-cat7-dept4079']")).click();
	}
}
