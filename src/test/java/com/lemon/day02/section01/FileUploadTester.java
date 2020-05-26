package com.lemon.day02.section01;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class FileUploadTester extends BastTester {

	//文件上传
	@Test
	public void f() {
		driver.get("");
		driver.findElement(By.id("")).sendKeys("C:\\a.txt");
		
		
		/**
		 * 1:识别验证码（识别率不高，没有通用性）
		 * 2：除去验证码（缺点：与生产库、生成库）、测试库（找开发）
		 * 3：万能验证码
		 * 4：Cookie
		 */
	}
}
