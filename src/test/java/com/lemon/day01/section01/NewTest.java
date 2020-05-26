package com.lemon.day01.section01;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTest extends BastTester {
	@Test
  public void f() {
	  driver.get("http://www.baidu.com");
	  getElement(By.id("kw")).click();
  }
}
