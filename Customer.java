package com.test;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "mobileNumber")
	private String mobileNumber;

	@OneToOne(targetEntity = Transection.class, cascade = CascadeType.ALL)
	private Transection transection;

	private int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	private String getFirstName() {
		return firstName;
	}

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String getMobileNumber() {
		return mobileNumber;
	}

	void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	private Transection getTransection() {
		return transection;
	}

	void setTransection(Transection transection) {
		this.transection = transection;
	}

}
