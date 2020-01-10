package org.js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScri {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace sgbharathi\\JavaScript\\ChromeDriver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://facebook.com");
	
	WebElement username = driver.findElement(By.id("email"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	
	
	}
}
