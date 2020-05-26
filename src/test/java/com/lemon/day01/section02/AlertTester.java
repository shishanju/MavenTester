package com.lemon.day01.section02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class AlertTester extends BastTester{
	
	//alert弹窗操作
	@Test
	public void f() {
/*		driver.get("http://www.baidu.com");
		driver.findElement(By.id("id"));
		//单个选择按钮alert
		Alert alert = driver.switchTo().alert();
		//获得文本
		alert.getText();
		//确定
		alert.accept();
		//取消
		alert.dismiss();*/
		
		//多个选择按钮confirm
		driver.get("http://www.baidu.com");
		Alert alert = driver.switchTo().alert();
		//确定
		alert.accept();
		//取消
		alert.dismiss();
		
	}
}
