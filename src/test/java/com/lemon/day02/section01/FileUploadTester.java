package com.lemon.day02.section01;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class FileUploadTester extends BastTester {

	//�ļ��ϴ�
	@Test
	public void f() {
		driver.get("");
		driver.findElement(By.id("")).sendKeys("C:\\a.txt");
		
		
		/**
		 * 1:ʶ����֤�루ʶ���ʲ��ߣ�û��ͨ���ԣ�
		 * 2����ȥ��֤�루ȱ�㣺�������⡢���ɿ⣩�����Կ⣨�ҿ�����
		 * 3��������֤��
		 * 4��Cookie
		 */
	}
}
