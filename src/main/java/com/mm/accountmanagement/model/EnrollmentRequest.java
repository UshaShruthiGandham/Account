package com.mm.accountmanagement.model;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.mm.accountmanagement.common.model.AddressType;
import com.mm.accountmanagement.common.model.SecurityQuestionType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentRequest {

	@NotNull(message = "Username cannot be null")
	@Size(min = 8, max = 12, message = "Please enter a Username between 8 and 12")
	private String userName;

	@Pattern(regexp = "((?=.*[@!#$%])(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,22})", message = "must contains one digit from 0-9 /n"
			+ "must contains one lowercase characters /n" + "must contains one uppercase characters /n"
			+ "must contains one special symbols in the list \"!@#$%\"" + "\n"
			+ "length at least 8 characters and maximum of 25")
	private String password;

	@Pattern(regexp = "^(.+)@(.+)$")
	private String email;

	// https://howtodoinjava.com/regex/java-regex-validate-social-security-numbers-ssn/
	@Pattern(regexp = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$", message = "invalid SSN# or format")
	private String SSN;

	// https://howtodoinjava.com/regex/java-regex-validate-and-format-north-american-phone-numbers/
	@Pattern(regexp = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$", message = "Invalid phone# or format")
	private String phoneNumber;

	private AddressType address;

	private List<SecurityQuestionType> securityQuestions;

}
