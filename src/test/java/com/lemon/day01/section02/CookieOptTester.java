package com.lemon.day01.section02;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver.Options;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class CookieOptTester extends BastTester {
	
	//Cookie操作
	@Test
	public void f() {
		driver.get("http://www.baidu.com");
		Options  options = driver.manage();
		//创建一个cookie
		Cookie cookie = new Cookie("123", "13800000000");
		//添加cookie
		options.addCookie(cookie);
		//需要再次登陆一次
		//应用场景：绕过验证码直接登陆,cookie过期需要重新获取新的cookie
		driver.get("http://www.baidu.com");
		
		
		
		
	}
}
