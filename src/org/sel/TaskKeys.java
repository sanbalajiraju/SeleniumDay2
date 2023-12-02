package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskKeys {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("APjFqb"));
		element.sendKeys("OmrBranch",Keys.ENTER);
		WebElement firstLink = driver.findElement(By.xpath("//h3[text()='Thoraipakkam OMR Branch']"));
		firstLink.click();
		
		
		
		WebElement usrName = driver.findElement(By.id("email"));
		usrName.sendKeys("greenstechnology@gmail.com");
		WebElement passWord = driver.findElement(By.id("pass"));
		passWord.sendKeys("greentechin");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit'][1]"));
		btnLogin.click();
	}
}