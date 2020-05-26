package com.lemon.day01.section02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class IfrmaeTester extends BastTester{
	
	//iframe切换操作
	@Test
	public void f() {
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("123");
		
//		driver.switchTo().frame(index);	//索引
//		driver.switchTo().frame(nameOrId)	//name | id
//		driver.switchTo().frame(frameElement);	//元素
		//找到iframe的 索引或name或元素
		WebElement iframe = driver.findElement(By.id("kw"));
		//切换iframe
		driver.switchTo().frame(iframe);
		//切换回来
		driver.switchTo().defaultContent();
	}

}
