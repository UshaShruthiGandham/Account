package com.mm.accountmanagement.controller;

import static com.mm.accountmanagement.common.model.MessageStatusType.SUCCESS_STATUS;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.accountmanagement.common.model.ServiceResponse;
import com.mm.accountmanagement.model.EnrollmentRequest;

import lombok.extern.log4j.Log4j2;

/**
 * @author Shri
 *
 */
@Log4j2
@RestController
@RequestMapping("api/v1/account")
public class AccountController {

	@PostMapping("/users")
	public ServiceResponse<String> enrollUser(@Valid @RequestBody final EnrollmentRequest request) {
		log.info("Entered enrollUser controller");
		return new ServiceResponse<>(null, SUCCESS_STATUS.getStatusType());

	}

}
