package com.lemon.day01.section02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class DataPickerTester1 extends BastTester{

	//ʱ��ؼ�����
	@Test
	public void f() {
		driver.get("");
		driver.findElement(By.id(""));
		
		WebElement element = driver.findElement(By.id(""));
		element.click();
		
		//��λʱ��ռ�
		//Ҫ����ʱ����ʾ�ͷ�Χȥ��д
		driver.findElement(By.id("ʱ��")).sendKeys("2020-04-21");
		
	}
}
