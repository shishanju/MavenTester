package com.lemon.day01.section02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.lemon.day01.section01.BastTester;

public class CheckboxTester extends BastTester{

	//��ѡ�����
	public void f() {
		driver.get("http://www.baidu.com");
		List<WebElement> elements = driver.findElements(By.name("kw"));
		elements.get(0).click();
		elements.get(1).click();
		elements.get(2).click();
		
		for (WebElement webElement : elements) {
			//�Ƿ�ѡ��
			System.out.println(webElement.isSelected());
		}
	}
}
