package curs19;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class SeleniumLocators extends BaseTest{
	
	/*
	 * tagname
	 * linktext
	 * partial link text
	 * id
	 * class
	 * name
	 * css selector
	 * xpath
	 * 
	 */
	
	//relative locators
	/*
	 * toLeftOf
	 * toRightOf
	 * below
	 * above
	 * near
	 * 
	 */
	@Test(priority=1)
	public void tagNameLocator() {
		
		WebElement discoverText = driver.findElement(By.tagName("em"));
		
		String text = discoverText.getText();//citeste (return) textul dintre tag-ul html
		System.out.println(text);
		assertEquals(text, "Discover");
		
	}
	@Test(priority=2)
	public void linkTextLocator() {
		
		driver.findElement(By.linkText("BOOKS")).click();
		driver.getCurrentUrl();//citeste URL curent la care se afla browser-ul
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");
	}
	
	@Test(priority=3)
	public void partialLinkTextLocator() {
		driver.findElement(By.partialLinkText("Healthy")).click();
		
		WebElement booksCategory = driver.findElement(By.linkText("Cookbooks"));
		assertTrue(booksCategory.isDisplayed());
	}
	@Test(priority=4)
	public void classNameLocator() {		
		WebElement price = driver.findElement(By.className("price"));
		System.out.println(price.getText());
		assertTrue(price.getText().contains("18.49"));		
	}
	@Test(priority=5)
	public void idLocator() {
		
		WebElement reviewTab = driver.findElement(By.id("tab-title-reviews"));
		reviewTab.click();
		WebElement commentBox = driver.findElement(By.id("comment"));
		assertTrue(commentBox.isDisplayed());		
	}
	@Test(priority=6)
	public void nameLocator() throws InterruptedException {
		WebElement commentBox = driver.findElement(By.id("comment"));
		commentBox.sendKeys("Super mesaj");
		Thread.sleep(3000);
		commentBox.clear();//sterge valoarea prezenta intr-un input sau text area field
		commentBox.sendKeys("Alt Super mesaj!");
	}
	@Test(priority=7)
	public void cssSelectorLocator() {
		driver.findElement(By.cssSelector("input[id='author']")).sendKeys("John Wick");		
	}
	@Test(priority=8)
	public void xPathLocator() {
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test@test.com");
	}

}
