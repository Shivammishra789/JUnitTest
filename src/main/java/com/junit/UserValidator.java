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
		
		//method for validation of user password using regex
		public boolean validatePassword(String password) {
			regex = "^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$";
			pattern = Pattern.compile(regex);
			return pattern.matcher(password).matches();	
		}		
}
