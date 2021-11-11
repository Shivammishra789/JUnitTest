package com.junit;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
	
	UserValidator validator = new UserValidator();

	@Test 
	public void givenFirstName_WhenProper_ShouldReturn_True() {
		boolean result = validator.validateFirstName("Shivam");
		Assert.assertTrue(result);
	}
	
	@Test 
	public void givenFirstName_WhenNotProper_ShouldReturn_False() {
		boolean result = validator.validateFirstName("sh");
		Assert.assertFalse(result);
	}
	
	@Test 
	public void givenLastName_WhenProper_ShouldReturn_True() {
		boolean result = validator.validateFirstName("Mishra");
		Assert.assertTrue(result);
	}
	
	@Test 
	public void givenLastName_WhenNotProper_ShouldReturn_False() {
		boolean result = validator.validateFirstName("mis");
		Assert.assertFalse(result);
	}
	
	@Test 
	public void givenPassword_WhenProper_ShouldReturn_True() {
		boolean result = validator.validatePassword("Shivdg123&");
		Assert.assertTrue(result);
	}
	
	@Test 
	public void givenPassword_WhenNotProper_ShouldReturn_False() {
		boolean result = validator.validatePassword("shiv$123");
		Assert.assertFalse(result);
	}
}
