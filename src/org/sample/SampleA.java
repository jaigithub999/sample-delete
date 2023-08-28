package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleA {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SampleDelete\\Driver\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();

		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("jadsjfldsv@msdkl");
		driver.findElement(By.id("pass")).sendKeys("3532i5uou");
		WebElement logBtn= driver.findElement(By.name("login"));
		logBtn.click();
		WebElement errorMsg = driver.findElement(By.xpath("//div[contains(text(),'The email address or mobile number you entered')]"));
		String credentialType = "negative";
		if (credentialType.equals("positive")) {
			//user entered in home page
			WebElement WelcomMsg=driver.findElement(By.xpath("//span[text()='welcome']"));
			if (WelcomMsg.isDisplayed()) {
				System.out.println(WelcomMsg.getText());
			}
		}
		else if (credentialType.equals("negative")) {
			if (errorMsg.isDisplayed()) {
				System.out.println(errorMsg.getText());
			}
		}
		else {
			System.out.println("welcome message is not show when user enter vaide credential");
		}
		
		
		
	}

}
