package org.js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace sgbharathi\\JavaScript\\ChromeDriver\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://adactin.com/HotelApp/index.php");

JavascriptExecutor js=(JavascriptExecutor)driver;

//user name and password highlighted by green color and red box
WebElement username = driver.findElement(By.id("username"));
js.executeScript("arguments[0].setAttribute('style','background:green;border:solid 2px red');", username);
username.sendKeys("Bharathi");

//password
WebElement password = driver.findElement(By.id("password"));
js.executeScript("arguments[0].setAttribute('style','background:green;border:solid 2px red');", password);
password.sendKeys("srinivasan");

Thread.sleep(10000);

//login button highlighted by yellow color and green box

WebElement login = driver.findElement(By.id("login"));
js.executeScript("arguments[0].setAttribute('style','background:yellow;border:solid 2px green');", login);
login.click();




}
}
