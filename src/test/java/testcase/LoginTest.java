package testcase;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest {
	@Test(priority = 1)//(invocationCount = 5)
	public static void UserLogin() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		// accept all cookies
//		WebElement acceptAllBtn = driver.findElement(By.xpath(loginLocatorsProp.getProperty("accept_all_cookies")));
//		if(acceptAllBtn.isDisplayed()) acceptAllBtn.click();
		// RESEARCH: HOW TO CHECK IF A BUTTON IS DISPLAYED, VISIBLE, ETC.
		if(driver.findElement(By.xpath(loginLocatorsProp.getProperty("accept_all_cookies"))).isDisplayed()) {
			driver.findElement(By.xpath(loginLocatorsProp.getProperty("accept_all_cookies"))).click();
		}
		
		// click the sign in button
		WebElement signinBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loginLocatorsProp.getProperty("signin_link"))));
		signinBtn.click();
		// enter email
		driver.findElement(By.xpath(loginLocatorsProp.getProperty("email_input_field"))).sendKeys(loginLocatorsProp.getProperty("email"));
		// enter password
		driver.findElement(By.cssSelector(loginLocatorsProp.getProperty("password_input_field"))).sendKeys(loginLocatorsProp.getProperty("password"));
		// click login button
		driver.findElement(By.cssSelector(loginLocatorsProp.getProperty("login_btn"))).click();
		
		driver.findElement(By.xpath("//img[@class='header-desktoplogo-img']")).click();
	}
}
