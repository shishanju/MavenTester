package com.lemon.day01.section02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.lemon.day01.section01.BastTester;

public class SelectTester extends BastTester{

	
	//下拉框操作
	public void f() {
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("123");
		
		//下拉框
		WebElement selectElement = driver.findElement(By.id("kw"));
		Select select = new Select(selectElement);
		//索引选择		
		select.deselectByIndex(2);		
		//值选择
		select.deselectByValue("");
		//文本选择
		select.deselectByVisibleText("");
	}
}
