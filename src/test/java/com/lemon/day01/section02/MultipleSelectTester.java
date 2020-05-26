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
		//是否多选
		System.out.println(select.isMultiple());
		
		//得到所有的选项 打印是否被选择
		List<WebElement> options = select.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.isSelected());
		}
	}
}
