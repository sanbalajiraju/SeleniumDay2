package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	WebElement textLogin = driver.findElement(By.xpath("//h2[contains(text(),'F')]"));
	String text = textLogin.getText();
	System.out.println(text);
	
}
}