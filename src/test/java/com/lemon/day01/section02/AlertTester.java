package com.lemon.day01.section02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class AlertTester extends BastTester{
	
	//alert��������
	@Test
	public void f() {
/*		driver.get("http://www.baidu.com");
		driver.findElement(By.id("id"));
		//����ѡ��ťalert
		Alert alert = driver.switchTo().alert();
		//����ı�
		alert.getText();
		//ȷ��
		alert.accept();
		//ȡ��
		alert.dismiss();*/
		
		//���ѡ��ťconfirm
		driver.get("http://www.baidu.com");
		Alert alert = driver.switchTo().alert();
		//ȷ��
		alert.accept();
		//ȡ��
		alert.dismiss();
		
	}
}
