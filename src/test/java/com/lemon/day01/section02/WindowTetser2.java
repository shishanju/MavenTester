package com.lemon.day01.section02;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class WindowTetser2 extends BastTester{

	//窗口切换操作
	@Test
	public void f() {
		driver.get("");
		
		
		//当前窗口句柄
		String firstHandle = driver.getWindowHandle();
		//打开了第二个窗口
		driver.findElement(By.id("kw")).click();
		
		//获得多有窗口句柄
		Set<String> allHandles = driver.getWindowHandles();
		//得到第二个窗口的句柄
		
		for (String handle : allHandles) {
			//如果这个句柄不是当前窗口句柄就是第二个窗口句柄
			//不用 ！=  是因为这个方法获取的时内存地址 而当前要获得的时字面显示所以用equals
			if (!handle.equals(firstHandle)) {
				String secondHandle = handle;
				//切换到第二个窗口句柄
				driver.switchTo().window(secondHandle);
			}
			
		}
		//想要再第一个窗口进行操作 在切换回来
		driver.switchTo().window(firstHandle);
		
	}
}
