package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.chromium.*;
//import org.openqa.selenium.remote
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//download the chrome driver and stores it for us
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		
//		driver.get("https://www.venus.com/");
		
		// accept all cookies
//		WebElement acceptAllBtn = driver.findElement(By.xpath("//button[text()='Accept All']"));
//		if(acceptAllBtn.isDisplayed()) acceptAllBtn.click();
//		//driver.findElement(By.xpath("//button[text()='Accept All']")).click();
//		
//		// click the sign in button
//		driver.findElement(By.xpath("//a[@class='header-desktopsignin-a']")).click();
//		// enter email
//		driver.findElement(By.xpath("//input[@id='login-email-input']")).sendKeys("glambert@venus.com");
//		// enter password
//		driver.findElement(By.cssSelector("input[id='login-password-input']")).sendKeys("Franlamb@9");
//		// click login button
//		driver.findElement(By.cssSelector("#login-loginbutton-btn")).click();
		
		
//		driver.findElement(By.id("login_id")).sendKeys("lambertslogistics@gmail.com");
//		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
//		WebElement passInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='PASSWORD']")));
//		passInput.sendKeys("ZohoTestingFramework1");
//		driver.findElement(By.cssSelector("button[id='nextbtn']")).click();
	}

}
