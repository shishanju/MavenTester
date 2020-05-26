package com.lemon.day01.section02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class IfrmaeTester extends BastTester{
	
	//iframe�л�����
	@Test
	public void f() {
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("123");
		
//		driver.switchTo().frame(index);	//����
//		driver.switchTo().frame(nameOrId)	//name | id
//		driver.switchTo().frame(frameElement);	//Ԫ��
		//�ҵ�iframe�� ������name��Ԫ��
		WebElement iframe = driver.findElement(By.id("kw"));
		//�л�iframe
		driver.switchTo().frame(iframe);
		//�л�����
		driver.switchTo().defaultContent();
	}

}
