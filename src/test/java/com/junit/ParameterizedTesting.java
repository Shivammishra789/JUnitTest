package com.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedTesting {
	public String email;
	public Boolean expectedResult;

	public ParameterizedTesting(String email, boolean expectedResult) {
		this.email = email;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {
			{ "abc@yahoo.com", true } ,
			{ "abc-100@yahoo.com", true } ,
			{ "abc.100@yahoo.com", true } ,
			{ "abc111@abc.com", true } ,
			{ "abc-100@abc.net", true } ,
			{ "abc.100@abc.com.au", true } ,
			{ "abc@1.com", true } ,
			{ "abc@gmail.com.com", true } ,
			{ "abc+100@gmail.com", true } ,
			{ "abc", false } ,
			{ "abc@.com.my", false } ,
			{ "abc123@gmail.a", false } ,
			{ "abc123@.com", false } ,
			{ "abc123@.com.com", false } ,
			{ ".abc@abc.com", false } ,
			{ "abc()*@gmail.com", false } ,
			{ "abc@%*.com", false } ,
			{ "abc..2002@gmail.com", false } ,
			{ "abc.@gmail.com", false } ,
			{ "abc@abc@gmail.com", false } ,
			{ "abc@gmail.com.1a", false } ,
			{ "abc@gmail.com.aa.au", false }
			} );
	}


	// Validate Emails using regex Return true if the string value passes else return false

	@Test
	public void givenEmailId_ShouldReturnTrueOrFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmailId(this.email);
		Assert.assertEquals(expectedResult, result);
	}
}