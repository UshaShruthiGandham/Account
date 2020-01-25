package com.mm.accountmanagement.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorMessageCode {

	SYSTEM_ERROR("FD9999", "System Error"), ENROLLMENT_ERROR("ES1020", "Enrollment process failed");

	String code;
	String shortDesc;

	public static ErrorMessageCode parseCode(final String code) {

		for (final ErrorMessageCode messageCode : ErrorMessageCode.values()) {
			if (messageCode.code.equalsIgnoreCase(code)) {
				return messageCode;
			}

		}
		return SYSTEM_ERROR;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

}
