package com.lemon.day01.section02;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class DataPickerTester2 extends BastTester{

	@Test
	public void f() {
		driver.get("");
		
		//�Ƴ�ֻ������
		String js = "documen.getElementById('jgawb').removeAttribute('readonly')";
		((JavascriptExecutor)driver).executeScript(js);
		
		//����������ܴ�����������
		driver.findElement(By.id("")).clear();
		//�������
		driver.findElement(By.id(""));
	}
	
}
