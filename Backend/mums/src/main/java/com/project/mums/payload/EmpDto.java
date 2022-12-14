package com.project.mums.payload;

import java.sql.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

public class EmpDto {
	
	@NotEmpty
	@Size(min=4, max=4, message="Employee ID should only contain 4 characters")
	private String empno;
	
	@NotEmpty
	@Size(min=4, max=25, message="Employee name should have 4-25 characters")
	private String ename;
	
	@NotNull
	@Min (value=15000, message="Basic salary should be greater than Rs. 15000")
	@Max (value=50000, message="Basic salary should be less than Rs. 50000")
	private float basicSal;
	
	@NotEmpty
	@Size(min=1, max=1)
	private String deptno;
	
	private Integer holidays;
	
	@NotNull
	private char job;
	
	@NotEmpty
	@Size(min=4, max=4, message="City should only ontain 4 charactes")
    private String city;
	
	@NotEmpty
	@Email(message="Enter proper e-mail address")
    private String email;
	
	@NotNull
	@PastOrPresent(message="Hiredate cant be a date in future")
    private Date hiredate;
	
	private String photo;

    
    
    //Constructors, getters and setters
	public EmpDto() {
		super();
	}

	

		
	public EmpDto(
			@NotEmpty @Size(min = 4, max = 4, message = "Employee ID should only contain 4 characters") String empno,
			@NotEmpty @Size(min = 4, max = 25, message = "Employee name should have 4-25 characters") String ename,
			@NotNull @Min(value = 15000, message = "Basic salary should be greater than Rs. 15000") @Max(value = 50000, message = "Basic salary should be less than Rs. 50000") float basicSal,
			@NotEmpty @Size(min = 1, max = 1) String deptno, Integer holidays, @NotNull char job,
			@NotEmpty @Size(min = 4, max = 4, message = "City should only ontain 4 charactes") String city,
			@NotEmpty @Email(message = "Enter proper e-mail address") String email,
			@NotNull @PastOrPresent(message = "Hiredate cant be a date in future") Date hiredate, String photo) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.basicSal = basicSal;
		this.deptno = deptno;
		this.holidays = holidays;
		this.job = job;
		this.city = city;
		this.email = email;
		this.hiredate = hiredate;
		this.photo = photo;
	}




	public String getEmpno() {
		return empno;
	}



	public void setEmpno(String empno) {
		this.empno = empno;
	}

	
	public String getEname() {
		return ename;
	}
	
	
	public void setEname(String ename) {
		this.ename = ename.toUpperCase();
	}
	

	public float getBasicSal() {
		return basicSal;
	}



	public void setBasicSal(float basicSal) {
		this.basicSal = basicSal;
	}



	public String getDeptno() {
		return deptno;
	}



	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}



	public char getJob() {
		return job;
	}



	public void setJob(char job) {
		this.job = job;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}


	
	public Date getHiredate() {
		return hiredate;
	}



	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getHolidays() {
		return holidays;
	}

	public void setHolidays(Integer holidays) {
		this.holidays = holidays;
	}
	
	
}
