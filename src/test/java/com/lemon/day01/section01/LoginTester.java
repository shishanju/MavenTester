package com.lemon.day01.section01;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class LoginTester extends BastTester{
	
	
	public WebElement getElement(WebDriver driver, long timeOutInSeconds, final By by) {
		WebDriverWait wait =  new WebDriverWait(driver, 3);
		wait.until(new ExpectedCondition<WebElement>() {


			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(by);
			}
		});
		return null;
	}
	
}
