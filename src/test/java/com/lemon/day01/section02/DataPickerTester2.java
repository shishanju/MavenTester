package com.lemon.day01.section02;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class DataPickerTester2 extends BastTester{

	@Test
	public void f() {
		driver.get("");
		
		//移除只读属性
		String js = "documen.getElementById('jgawb').removeAttribute('readonly')";
		((JavascriptExecutor)driver).executeScript(js);
		
		//先清除，可能存在输入内容
		driver.findElement(By.id("")).clear();
		//点击输入
		driver.findElement(By.id(""));
	}
	
}
