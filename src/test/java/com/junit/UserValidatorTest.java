package com.junit;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
	
	// testing for custom exception 

	UserValidator validator = new UserValidator();

	@Test 
	public void givenFirstName_WhenProper_ShouldReturn_True() throws UserRegistrationException {
		boolean result = validator.validateFirstName("Shivam");
		Assert.assertTrue(result);
	}

	@Test 
	public void givenFirstName_WhenNotProper_ShouldReturn_False()throws UserRegistrationException {
		try {
			validator.validateFirstName("sh");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
		}
	}

	@Test 
	public void givenLastName_WhenProper_ShouldReturn_True() throws UserRegistrationException {
		boolean result = validator.validateLastName("Mishra");
		Assert.assertTrue(result);
	}

	@Test 
	public void givenLastName_WhenNotProper_ShouldReturn_False() throws UserRegistrationException {
		try {
			validator.validateLastName("mis");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_LAST_NAME, e.type);
		}
	}

	@Test 
	public void givenEmailId_WhenProper_ShouldReturn_True() throws UserRegistrationException{
		boolean result = validator.validateEmailId("Shivam.mishra@gmail.com");
		Assert.assertTrue(result);
	}

	@Test 
	public void givenEmailId_WhenNotProper_ShouldReturn_False(){
		try {
			validator.validateEmailId("abc@.com.my");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL_ID, e.type);
		}
	}

	@Test 
	public void givenPhoneNo_WhenProper_ShouldReturn_True() throws UserRegistrationException{
		boolean result = validator.validatePhoneNo("91 7894561230");
		Assert.assertTrue(result);
	}

	@Test 
	public void givenPhoneNo_WhenNotProper_ShouldReturn_False() throws UserRegistrationException{
		try {
			validator.validatePhoneNo("8794512879");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PHONE_NUMBER, e.type);
		}
	}

	@Test 
	public void givenPassword_WhenProper_ShouldReturn_True() throws UserRegistrationException {
		boolean result = validator.validatePassword("Shivdg123&");
		Assert.assertTrue(result);
	}

	@Test 
	public void givenPassword_WhenNotProper_ShouldReturn_False() {
		try {
			validator.validatePassword("shiv$123");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.type);
		}
	}
}
