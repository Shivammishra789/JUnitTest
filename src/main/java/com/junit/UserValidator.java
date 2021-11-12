package com.junit;

import java.util.regex.Pattern;

public class UserValidator {

	String regex;
	Pattern pattern;

	//method for validation of user first name using regex
	public boolean validateFirstName(String firstName) throws UserRegistrationException {
		regex = "^[A-Z]{1}[a-z]{2,}";
		pattern = Pattern.compile(regex);
		if (pattern.matcher(firstName).matches()) { 
			return true;
		} else {
			// throwing custom exception 
			throw new UserRegistrationException("Enter valid firstName", UserRegistrationException.ExceptionType.INVALID_FIRST_NAME);
		} 	
	}

	//method for validation of user last name using regex
	public boolean validateLastName(String lastName) throws UserRegistrationException{
		regex = "^[A-Z]{1}[a-z]{2,}";
		pattern = Pattern.compile(regex);
		if (pattern.matcher(lastName).matches()) { 
			return true;
		} else {
			throw new UserRegistrationException("Enter valid lastName", UserRegistrationException.ExceptionType.INVALID_LAST_NAME);
		}	
	}

	//method for validation of user emailId using regex
	public boolean validateEmailId(String emailId) throws UserRegistrationException{ 
		regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9-]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";
		pattern = Pattern.compile(regex);
		if (pattern.matcher(emailId).matches()) { 
			return true;
		} else {
			throw new UserRegistrationException("Enter valid emailId", UserRegistrationException.ExceptionType.INVALID_EMAIL_ID);
		}
	}

	//method for validation of user phone number using regex
	public boolean validatePhoneNo(String phoneNo) throws UserRegistrationException{
		regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
		pattern  = Pattern.compile(regex);
		if (pattern.matcher(phoneNo).matches()) { 
			return true;
		} else {
			throw new UserRegistrationException("Enter valid phone Number", UserRegistrationException.ExceptionType.INVALID_PHONE_NUMBER);
		}
	}

	//method for validation of user password using regex
	public boolean validatePassword(String password) throws UserRegistrationException{
		regex = "^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$";
		pattern = Pattern.compile(regex);
		if (pattern.matcher(password).matches()) { 
			return true;
		} else {
			throw new UserRegistrationException("Enter valid password", UserRegistrationException.ExceptionType.INVALID_PASSWORD);
		}
	}		
}
