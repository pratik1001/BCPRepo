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
	private int appointmentId;
	private String appointmentDateTime;
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


	public Appointment(String appointmentDateTime, char isApproved, Test test, Users user) {
		super();
		this.appointmentDateTime = appointmentDateTime;
		this.isApproved = isApproved;
		this.test = test;
		this.user = user;
	}

	public Appointment(int appointmentId, String appointmentDateTime, char isApproved, Test test,
			Users user) {
		super();
		this.appointmentId = appointmentId;
		this.appointmentDateTime = appointmentDateTime;
		this.isApproved = isApproved;
		this.test = test;
		this.user = user;
	}




	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
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
		return appointmentDateTime;
	}

	public void setAppointmentDateTime(String appointmentDateTime) {
		this.appointmentDateTime = appointmentDateTime;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", appointmentDateTime=" + appointmentDateTime
				+ ", isApproved=" + isApproved + ", test=" + test + ", user=" + user + "]";
	}
	
	
	
}
