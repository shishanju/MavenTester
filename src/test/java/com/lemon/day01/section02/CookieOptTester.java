package com.lemon.day01.section02;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver.Options;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class CookieOptTester extends BastTester {
	
	//Cookie����
	@Test
	public void f() {
		driver.get("http://www.baidu.com");
		Options  options = driver.manage();
		//����һ��cookie
		Cookie cookie = new Cookie("123", "13800000000");
		//���cookie
		options.addCookie(cookie);
		//��Ҫ�ٴε�½һ��
		//Ӧ�ó������ƹ���֤��ֱ�ӵ�½,cookie������Ҫ���»�ȡ�µ�cookie
		driver.get("http://www.baidu.com");
		
		
		
		
	}
}
