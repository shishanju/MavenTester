package com.lemon.day02.section01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class Javascript extends BastTester{

	//失效的按钮进行操作
	@Test
	public void f() {
		
/*		driver.get("");
		driver.findElement(By.id("tt"));
		1.
		String js = "document.getElementById('tt').value='2018-8-18'";
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		executor.executeScript(js);*/
/*		
 		2.
		//获取百度主页面下面的字段
		driver.get("");
		String js = "var text=document.getElementById('cp').innerText;return text";
		String pText = (String) ((JavascriptExecutor)driver).executeScript(js);
		System.out.println(pText);*/
		
		//3.获得百度输入框的元素
		driver.get("");
		
		String js = "var ele=document.getElementById('kw');return ele";
		WebElement input = (WebElement) ((JavascriptExecutor)driver).executeScript(js);
		input.sendKeys("妖精的尾巴");
		
		String jString = "document.getElementById('tt').value='2018-02-05'";
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript(js);
		
	}
}
