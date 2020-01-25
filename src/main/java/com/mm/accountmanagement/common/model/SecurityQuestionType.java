package com.mm.accountmanagement.common.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecurityQuestionType {

	private String securityQsn;

	private String securityQsnAnswer;
}
