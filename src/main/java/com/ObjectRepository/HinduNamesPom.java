package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HinduNamesPom extends FunctionalLibrary {
	private static String verify = "";

	public static String getVerify() {
		return verify;
	}

	@FindBy(className = "table borderless")
	private static WebElement tblNames;

	public WebElement getTblNames() {
		return tblNames;
	}

	public HinduNamesPom() {
		PageFactory.initElements(driver, this);
	}

	public static String GotoAlphabet(String alphabet) {
		WebElement pageParent = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div/div/div/div/table/tbody/tr/td"));
		List<WebElement> list2 = pageParent.findElements(By.tagName("a"));
		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i).getText().equals(alphabet)) {
				verify = list2.get(i).getText();
				list2.get(i).click();
				break;
			}
		}
		return verify;
	}

}
