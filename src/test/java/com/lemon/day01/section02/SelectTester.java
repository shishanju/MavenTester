package com.lemon.day01.section02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.lemon.day01.section01.BastTester;

public class SelectTester extends BastTester{

	
	//���������
	public void f() {
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("123");
		
		//������
		WebElement selectElement = driver.findElement(By.id("kw"));
		Select select = new Select(selectElement);
		//����ѡ��		
		select.deselectByIndex(2);		
		//ֵѡ��
		select.deselectByValue("");
		//�ı�ѡ��
		select.deselectByVisibleText("");
	}
}
