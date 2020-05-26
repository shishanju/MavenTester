package com.lemon.day01.section01;

import java.util.Set;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.testng.annotations.Test;

public class WebDriverApiTester extends BastTester{
	
	@Test
	public void f() {
		
		//��ȡ��ǰҳ��URL
		driver.getCurrentUrl();
		
		//���ص�ǰ���
		driver.getWindowHandle();
		
		//������������������򿪵ľ��
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			System.out.println(handle);
		}
		
		//��ȡ��ǰҳ��ı���
		driver.getTitle();
		
		//ǰ��
		driver.navigate().forward();
		
		//����
		driver.navigate().back();
		
		//ˢ��
		driver.navigate().refresh();
		
		Options options = driver.manage();
		Timeouts timeout = options.timeouts();
		
		Window window = options.window();
		//�������
		window.maximize();
		//���ڴ�С
		window.getSize();
		//���ô��ڴ�С
		//window.setSize();
		//����λ��
		//window.setPosition(2);;
		
		
	}

}
