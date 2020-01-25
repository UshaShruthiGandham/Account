package com.mm.accountmanagement.common.model;

import static com.mm.accountmanagement.common.model.Constants.E;
import static com.mm.accountmanagement.common.model.Constants.I;
import static com.mm.accountmanagement.common.model.Constants.SOURCE;
import static com.mm.accountmanagement.common.model.Constants.SUCCESS;
import static com.mm.accountmanagement.common.model.Constants.SUCCESS_CODE;
import static com.mm.accountmanagement.common.model.ErrorMessageCode.ENROLLMENT_ERROR;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MessageStatusType {

	SUCCESS_STATUS(new StatusType(I, SUCCESS_CODE, SUCCESS, SOURCE)),

	FAILED_STATUS(new StatusType(E, ENROLLMENT_ERROR.getCode(), ENROLLMENT_ERROR.getShortDesc(), SOURCE));

	private final StatusType statusType;
}