package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysUpDown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("welcome");
		Actions actions=new Actions(driver);
		actions.doubleClick(element).perform();
		
		
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
//		element.sendKeys("iphone",Keys.ENTER);

//		driver.get("https://www.facebook.com/");
//		WebElement element = driver.findElement(By.id("email"));
// 		Actions actions=new Actions(driver);
//		actions.keyDown(Keys.SHIFT).sendKeys(element, "welcome").keyUp(Keys.SHIFT).perform();
		
		
		
	}

}
