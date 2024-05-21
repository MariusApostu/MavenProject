package curs23;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class ImplicitWaitExample extends BaseTest{
	
	@Test
	public void implicitWaitExample() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		//implicit wait asteapta ca elementul sa existe in DOM
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("div[id='start']>button")).click();
		
		//Thread.sleep(10000); --> bad practice
		
		WebElement finishTest = driver.findElement(By.cssSelector("div[id='finish']>h4"));
		assertEquals(finishTest.getText(), "Hello World!");
		
		
		
	}

}
