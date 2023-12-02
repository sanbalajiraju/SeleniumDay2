package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseLanch {
 public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.greenstechnologys.com/index.html");
	
	WebElement textFacebook = driver.findElement(By.xpath("//p[contains(text(),' is a leading Training and Placements company in Chennai. We are known')]"));
	//getText()---Webelement
	String text = textFacebook.getText();
	System.out.println(text);
	
 
 }
}
