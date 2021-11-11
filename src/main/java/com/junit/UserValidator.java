package com.junit;

import java.util.regex.Pattern;

public class UserValidator {

	String regex;
	Pattern pattern;

	//method for validation of user first name using regex
	public boolean validateFirstName(String firstName) {
		regex = "^[A-Z]{1}[a-z]{2,}";
		pattern = Pattern.compile(regex);
		return pattern.matcher(firstName).matches();	
	}

	//method for validation of user last name using regex
	public boolean validateLastName(String lastName) {
		regex = "^[A-Z]{1}[a-z]{2,}";
		pattern = Pattern.compile(regex);
		return pattern.matcher(lastName).matches();	
	}

	//method for validation of user emailId using regex
	public boolean validateEmailId(String emailId) { 
		regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9-]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";
		pattern = Pattern.compile(regex);
		return pattern.matcher(emailId).matches();
	}

	//method for validation of user phone number using regex
	public boolean validatePhoneNo(String phoneNo) {
		regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
		pattern  = Pattern.compile(regex);
		return pattern.matcher(phoneNo).matches();
	}

	//method for validation of user password using regex
	public boolean validatePassword(String password) {
		regex = "^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$";
		pattern = Pattern.compile(regex);
		return pattern.matcher(password).matches();	
	}		
}
