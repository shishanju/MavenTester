package com.lemon.day01.section02;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.lemon.day01.section01.BastTester;

public class WindowTetser1 extends BastTester{
	
	//���ڲ��� ��������תɾ����ת����
	public void f() {
		driver.get("");
		
		//�Ƴ�һ������
		String js = "documen.getElementById('jgawb').removeAttribute('taeget')";
		//����ǿת,ʡ��16�д���
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		((JavascriptExecutor)driver).executeScript(js);
		driver.findElement(By.id("jgawb"));
		
	}
}
