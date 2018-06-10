package com.db.awmd.challenge.domain;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TransferMoney {
	@NotNull
	@NotEmpty
	private final String fromAccountId;
	@NotNull
	@NotEmpty
	private final String toAccountId;
	
	@NotNull
	@Min(value = 0, message = "Tranfer amount can not be zero.")
	private BigDecimal amount;
	
	@JsonCreator
	public TransferMoney(@JsonProperty("fromAccountId") String fromAccountId, 
						 @JsonProperty("toAccountId") String toAccountId, 
						 @JsonProperty("amount") BigDecimal amount) {
		this.fromAccountId = fromAccountId;
		this.toAccountId = toAccountId;
		this.amount = amount;
	}
	
	
}
