package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextContainss {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtCondition = driver.findElement(By.xpath("//a[contains(text(),'Conditions of ')]"));
		String text = txtCondition.getText();
		System.out.println(text);
	}
}
