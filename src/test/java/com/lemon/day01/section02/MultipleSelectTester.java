package com.lemon.day01.section02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.lemon.day01.section01.BastTester;

public class MultipleSelectTester extends BastTester{

	@Test
	public void f() throws InterruptedException{
		driver.get("");
		WebElement element = driver.findElement(By.id(""));
		
		Select select = new Select(element);
		//�Ƿ��ѡ
		System.out.println(select.isMultiple());
		
		//�õ����е�ѡ�� ��ӡ�Ƿ�ѡ��
		List<WebElement> options = select.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.isSelected());
		}
	}
}
