package com.lemon.day01.section02;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class WindowTetser2 extends BastTester{

	//�����л�����
	@Test
	public void f() {
		driver.get("");
		
		
		//��ǰ���ھ��
		String firstHandle = driver.getWindowHandle();
		//���˵ڶ�������
		driver.findElement(By.id("kw")).click();
		
		//��ö��д��ھ��
		Set<String> allHandles = driver.getWindowHandles();
		//�õ��ڶ������ڵľ��
		
		for (String handle : allHandles) {
			//������������ǵ�ǰ���ھ�����ǵڶ������ھ��
			//���� ��=  ����Ϊ���������ȡ��ʱ�ڴ��ַ ����ǰҪ��õ�ʱ������ʾ������equals
			if (!handle.equals(firstHandle)) {
				String secondHandle = handle;
				//�л����ڶ������ھ��
				driver.switchTo().window(secondHandle);
			}
			
		}
		//��Ҫ�ٵ�һ�����ڽ��в��� ���л�����
		driver.switchTo().window(firstHandle);
		
	}
}
