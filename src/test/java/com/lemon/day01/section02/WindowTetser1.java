package com.lemon.day01.section02;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.lemon.day01.section01.BastTester;

public class WindowTetser1 extends BastTester{
	
	//窗口操作 不进行跳转删除跳转属性
	public void f() {
		driver.get("");
		
		//移除一个属性
		String js = "documen.getElementById('jgawb').removeAttribute('taeget')";
		//进行强转,省略16行代码
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		((JavascriptExecutor)driver).executeScript(js);
		driver.findElement(By.id("jgawb"));
		
	}
}
