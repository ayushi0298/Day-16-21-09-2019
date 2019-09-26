package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class DetailsModel {
    @Id
	private int eno;
	private String name;
	private String bankName;
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
