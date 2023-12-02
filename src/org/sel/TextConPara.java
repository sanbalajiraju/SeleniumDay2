package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextConPara {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement findPara = driver.findElement(By.xpath("//p[contains(text(),'        Learn ')]"));
		String text = findPara.getText();
		System.out.println(text);
		}
}
