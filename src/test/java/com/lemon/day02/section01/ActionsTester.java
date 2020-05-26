package com.lemon.day02.section01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class ActionsTester extends BastTester{

	@Test
	public void f() {
		driver.get("");
		WebElement input = driver.findElement(By.id(""));
		WebElement button = driver.findElement(By.id(""));
		
		Actions actions = new Actions(driver);
		//À´ª˜
		actions.doubleClick().perform();;
		//º¸≈Ã ‰»Î
		actions.sendKeys(input, "").perform();;
		// Û±Í“∆∂Ø
		actions.moveToElement(button).perform();;
	}
}
