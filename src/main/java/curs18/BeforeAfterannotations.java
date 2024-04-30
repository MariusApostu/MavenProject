package curs18;

import org.testng.annotations.*;

public class BeforeAfterannotations {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
	

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	@Test
	public void test2() {
		System.out.println("Test2");
	}

}
