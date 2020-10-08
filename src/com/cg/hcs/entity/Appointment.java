package com.cg.hcs.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Appointment 
{
	@Id
	private int appId;
	private String appDate;
	private char isApproved;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="testId", referencedColumnName="testId")
	private Test test;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userId", referencedColumnName="userId")
	private Users user;

	public Appointment() {
		super();
	}


	public Appointment(String appDate, char isApproved, Test test, Users user) {
		super();
		this.appDate = appDate;
		this.isApproved = isApproved;
		this.test = test;
		this.user = user;
	}

	public Appointment(int appId, String appDate, char isApproved, Test test,
			Users user) {
		super();
		this.appId = appId;
		this.appDate = appDate;
		this.isApproved = isApproved;
		this.test = test;
		this.user = user;
	}




	public int getAppointmentId() {
		return appId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appId = appointmentId;
	}



	public char isApproved() {
		return isApproved;
	}

	public void setApproved(char approved) {
		this.isApproved = approved;
	}
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getAppointmentDateTime() {
		return appDate;
	}

	public void setAppointmentDateTime(String appointmentDateTime) {
		this.appDate = appointmentDateTime;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appId + ", appointmentDateTime=" + appDate
				+ ", isApproved=" + isApproved + ", test=" + test + ", user=" + user + "]";
	}
	
	
	
}
