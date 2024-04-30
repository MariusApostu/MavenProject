package curs18;

import static org.testng.Assert.*;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertinExample2 {

	//1. Hard Assertion
	//2. Soft Assertion
	
	//@Test
	public void hardAssertion() {		
		System.out.println("some code here!");
		assertTrue(false);
		System.out.println("some other code here!");
		assertEquals(12, 300);
		System.out.println("final code here!");
	}
	
	@Test
	public void softAssertion() {
		System.out.println("some code here!");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(false);
		System.out.println("some other code here!");
		sa.assertEquals(12, 300);
		System.out.println("final code here!");
		sa.assertAll();		
	}
	
}
