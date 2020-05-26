package com.lemon.day01.section02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class DataPickerTester1 extends BastTester{

	//时间控件操作
	@Test
	public void f() {
		driver.get("");
		driver.findElement(By.id(""));
		
		WebElement element = driver.findElement(By.id(""));
		element.click();
		
		//定位时间空间
		//要按照时间显示和范围去填写
		driver.findElement(By.id("时间")).sendKeys("2020-04-21");
		
	}
}
