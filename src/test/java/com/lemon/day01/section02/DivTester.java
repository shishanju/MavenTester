package com.lemon.day01.section02;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class DivTester extends BastTester{

	//div��ǩ����
	@Test
	public void f() {
		driver.get("http://www.baidu.com");
		driver.findElement(By.id(""));
		//��ҳ���ϵĵ�� 
		
	}
}
