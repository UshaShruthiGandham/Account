package com.mm.accountmanagement.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Shri
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StatusType {
	
	private String severity;
	
	private String code;
	
	private String text;
	
	private String source;

}
