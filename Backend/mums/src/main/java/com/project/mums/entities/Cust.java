package com.project.mums.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUST")
public class Cust {

	@Id
	@Column(name="CNUM")
	private int custno;
	
	@Column(name="SNUM")
	private String salesno;
	
	@Column(name="cname")
	private String custname;
	
	@Column(name="MOB",length=10,nullable=false)
	private long mobileNumber;
	
	private String city;
	private  byte rating;
	private String photo;
	
	
	
	public Cust(int custno, String salesno, String custname, long mobileNumber, String city, byte rating,
			String photo) {
		super();
		this.custno = custno;
		this.salesno = salesno;
		this.custname = custname;
		this.mobileNumber = mobileNumber;
		this.city = city;
		this.rating = rating;
		this.photo = photo;
	}


	public Cust() {
		super();
		}


	public int getCustno() {
		return custno;
	}

	public void setCustno(int custno) {
		this.custno = custno;
	}

	public String getSalesno() {
		return salesno;
	}

	public void setSalesno(String salesno) {
		this.salesno = salesno;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public byte getRating() {
		return rating;
	}

	public void setRating(byte rating) {
		this.rating = rating;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
}