
package com.cts.loanbazaar.loaneligibility.model;

import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CustomerDetails {


	@NotNull(message = "must not be null")
	@Size(min = 4, max = 30, message = "size must be between 4 and 30")
	public String name;

	@NotNull(message = "must not be null")
	public String gender;

	@NotEmpty(message = "must not be empty")
	@Email(message = "must be a well-formed email address")
	public String email;

	@NotNull(message = "must not be null")
	public Double monthlyIncome;

	@NotEmpty(message = "must not be empty")
	public String customerCity;

	@NotEmpty(message = "must not be empty")
	public String employmentType;

	@NotNull(message = "must not be null")
	public Double desiredLoanAmount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(Double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public Double getDesiredLoanAmount() {
		return desiredLoanAmount;
	}

	public void setDesiredLoanAmount(Double desiredLoanAmount) {
		this.desiredLoanAmount = desiredLoanAmount;
	}

}
