package com.junit;

import java.util.regex.Pattern;

public class UserValidator {

	static String regex;
	static Pattern pattern;

	//method for validation of user first name using regex
	public boolean validateFirstName(String firstName) {
		// regex pattern 
		regex = "^[A-Z]{1}[a-z]{2,}";
		pattern = Pattern.compile(regex);
		return pattern.matcher(firstName).matches();	
	}
}
