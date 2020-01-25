package com.mm.accountmanagement.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Shri
 *
 * @param <T>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceResponse<T> {

	private T data;

	private StatusType status;

}
