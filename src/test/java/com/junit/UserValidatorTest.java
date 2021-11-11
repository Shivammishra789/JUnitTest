package com.junit;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

	@Test 
	public void givenFirstName_WhenProper_ShouldReturn_True() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("Shivam");
		Assert.assertTrue(result);
	}
	
	@Test 
	public void givenFirstName_WhenNotProper_ShouldReturn_False() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("sh");
		Assert.assertFalse(result);
	}
	
	@Test 
	public void givenLastName_WhenProper_ShouldReturn_True() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("Mishra");
		Assert.assertTrue(result);
	}
	
	@Test 
	public void givenLastName_WhenNotProper_ShouldReturn_False() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("mis");
		Assert.assertFalse(result);
	}
}
