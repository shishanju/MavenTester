package com.lemon.day02.section01;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

import bsh.commands.dir;

public class ActionsTester02 extends BastTester{

	@Test
	public void f() {
		driver.get("");
		driver.findElement(By.id(""));
		
		//мов╖
		Actions actions = new Actions(driver);
		actions.clickAndHold().moveToElement(null).release().perform();
		
		actions.sendKeys(null, null);
	}
	
}
