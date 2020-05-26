package com.lemon.day01.section01;

import java.util.Set;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.testng.annotations.Test;

public class WebDriverApiTester extends BastTester{
	
	@Test
	public void f() {
		
		//获取当前页面URL
		driver.getCurrentUrl();
		
		//返回当前句柄
		driver.getWindowHandle();
		
		//返回所有由驱动对象打开的句柄
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			System.out.println(handle);
		}
		
		//获取当前页面的标题
		driver.getTitle();
		
		//前进
		driver.navigate().forward();
		
		//返回
		driver.navigate().back();
		
		//刷新
		driver.navigate().refresh();
		
		Options options = driver.manage();
		Timeouts timeout = options.timeouts();
		
		Window window = options.window();
		//窗口最大化
		window.maximize();
		//窗口大小
		window.getSize();
		//设置窗口大小
		//window.setSize();
		//窗口位置
		//window.setPosition(2);;
		
		
	}

}
