package com.test;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Transection {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "date")
	private Date date;

	@Column(name = "total")
	private int total;

	private int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	private Date getDate() {
		return date;
	}

	void setDate(Date date) {
		this.date = date;
	}

	private int getTotal() {
		return total;
	}

	void setTotal(int total) {
		this.total = total;
	}

}
