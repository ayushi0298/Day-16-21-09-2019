package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "employee")
public class DetailsModel {
	@Id
	private int eno;
	@Pattern(regexp = "[a-zA-Z]*", message = "Only Alphabates Allowed")
	private String name;
	@Pattern(regexp = "[a-zA-Z]*", message = "Only Alphabates Allowed")
	private String bankName;
	@Max(value = 100, message = "Maximum Score Can Be 10000000 Only")
	@Min(value = 0, message = "Negative balance Is Not Allowed")
	private int amount;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getAmount() {
		return amount;
	}

	public DetailsModel() {
		super();
	}

	public DetailsModel(int eno, String name, String bankName, int amount) {
		super();
		this.eno = eno;
		this.name = name;
		this.bankName = bankName;
		this.amount = amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
