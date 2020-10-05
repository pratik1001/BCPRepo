package com.cg.hcs.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Appointment 
{
	@Id
	private long appointmentId;
	private java.sql.Date dateTime;
	private boolean approved;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="center", referencedColumnName="center_id")
	private DiagnosticCenter center;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user", referencedColumnName="userId")
	private Users user;

	public long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public java.sql.Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(java.sql.Date dateTime) {
		this.dateTime = dateTime;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public DiagnosticCenter getCenter() {
		return center;
	}

	public void setCenter(DiagnosticCenter center) {
		this.center = center;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	
}
