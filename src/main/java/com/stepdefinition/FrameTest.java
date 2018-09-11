package com.stepdefinition;

import org.openqa.selenium.By;

import com.resources.FunctionalLibrary;

public class FrameTest extends FunctionalLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driverInit("chrome");
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame(driver.findElement(By.name("login_page")));
		driver.findElement(By.name("fldLoginUserId")).sendKeys("56679085");
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		driver.findElement(By.name("fldPassword")).sendKeys("abcd");

	}

}
